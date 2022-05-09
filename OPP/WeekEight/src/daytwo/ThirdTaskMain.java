package daytwo;

import java.io.*;
import java.util.*;

public class ThirdTaskMain {
    private static final String PERSON_FILE_NAME = "people.txt";
    private static final String PAYMENT_FILE_NAME = "payment.txt";
    private static final String SORTED_PERSON_FILE_RECEIVED = "sorted_people_received.txt";
    private static final String SORTED_PERSON_FILE_SEND = "sorted_people_send.txt";
    private static final String ID = "id";
    private static final String REGEX = ",";

    private final Map<Integer, PersonTeacher> persons = new HashMap<>();
    private final List<Payment> payments = new ArrayList<>();

    public static void main(String[] args) {
        ThirdTaskMain task = new ThirdTaskMain();
        task.fillPersonsData();
        task.readPayments();
/*        task.writeSortedPersonsByReceivedMoney();
        task.writeSortedPersonsBySendMoney();*/
        task.writePersonsToFile(SORTED_PERSON_FILE_RECEIVED, PersonTeacher.SORT_BY_RECEIVED_MONEY_DEC);
        task.writePersonsToFile(SORTED_PERSON_FILE_SEND, PersonTeacher.SORT_BY_SEND_MONEY_ASC);

        task.menu();


    }

    private void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                a. Atvaizduoti vartotoją kuris padarė daugiausiai pervedimų ir kiek jų padarė.
                b. Atvaizduoti vartotoją kuris gavo daugiausiai pervedimų ir kiek jų gavo.
                c. Atvaizduoti didžiausia pervedimą.Kas siuntė, kiek siunte ir kas gavo.
                d. Atvaizduoti mažiausia pervedimą.Kas siuntė, kiek siunte ir kas gavo.
                """);
        System.out.println("Pasirinkite ka norite atlikti:");
        String action = scanner.nextLine();
        switch(action){
            case "a" -> showMostSentMoneyPerson();
            case "b" -> showMostReceivedMoneyPerson();
            case "c" -> showMaxPayment();
            case "d" -> showMinPayment();
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void showMaxPayment(){
        Payment payment = null;
        for(Payment p : payments){
            if(payment == null || payment.sum() < p.sum()){
                payment = p;
            }
        }

        PersonTeacher receiverPerson = persons.get(payment.receiverId());
        PersonTeacher senderPerson = persons.get(payment.senderId());

        if(receiverPerson == null || senderPerson == null){
            return;
        }

        System.out.printf("Siuntejas: %s %s, suma: %s, gavejas: %s %s",senderPerson.getName(),senderPerson.getSurname(),payment.sum(), receiverPerson.getName(), receiverPerson.getSurname());
    }

    private void showMinPayment(){
        Payment payment = payments.get(0);
        for(int i =1; i<payments.size(); i++){
            if(payment.sum()>payments.get(i).sum()){
                payment = payments.get(i);
            }
        }
        PersonTeacher receiverPerson = persons.get(payment.receiverId());
        PersonTeacher senderPerson = persons.get(payment.senderId());

        if(receiverPerson == null || senderPerson == null){
            return;
        }

        System.out.printf("Siuntejas: %s %s, suma: %s, gavejas: %s %s",senderPerson.getName(),senderPerson.getSurname(),payment.sum(),receiverPerson.getName(),receiverPerson.getSurname());
    }


    private void showMostSentMoneyPerson(){
        PersonTeacher person = null;
        for(PersonTeacher p: persons.values()){
            if(person == null || person.getCountSendMoney() < p.getCountSendMoney()){
                person = p;
            }
        }
        System.out.printf("%s %s padare pervedimu %d\n", person.getName(),person.getSurname(),person.getCountSendMoney());
    }

    private void showMostReceivedMoneyPerson(){
        List<PersonTeacher> sortedPersons = new ArrayList<>(persons.values());
        sortedPersons.sort(PersonTeacher.SORT_BY_RECEIVED_MONEY_COUNT);

        PersonTeacher person = sortedPersons.get(0);
        System.out.printf("%s %s gavo pavedimu: %d\n",person.getName(),person.getSurname(),person.getCountReceiveMoney());
    }

/*    private void writeSortedPersonsBySendMoney() {
        List<Map.Entry<Integer,PersonTeacher>> sortedPersons = new ArrayList<>(persons.entrySet());
        sortedPersons.sort(PersonTeacher.SORT_BY_SEND_MONEY_ASC);

        writePersonsToFile(sortedPersons, SORTED_PERSON_FILE_SEND);
    }



    private void writeSortedPersonsByReceivedMoney() {
        List<Map.Entry<Integer, PersonTeacher>> sortedPersons = new ArrayList<>(persons.entrySet());
        sortedPersons.sort(PersonTeacher.SORT_BY_RECEIVED_MONEY_DEC);

        writePersonsToFile(sortedPersons, SORTED_PERSON_FILE_RECEIVED);

    }*/


    private void writePersonsToFile(String fileName, Comparator<PersonTeacher> comparator){
        List<PersonTeacher> sortedPersons = new ArrayList<>(persons.values());
        sortedPersons.sort(comparator);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            for(PersonTeacher person : sortedPersons){
                bw.write(person.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }



    private void readPayments() {
        try (BufferedReader br = new BufferedReader(new FileReader(PAYMENT_FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(ID)) {
                    continue;
                }
                String[] splits = line.split(REGEX);
                if (splits.length < 4) {
                    continue;
                }
                Payment payment = new Payment(Integer.parseInt(splits[0].trim()),Integer.parseInt(splits[1].trim()),Integer.parseInt(splits[2].trim()),Integer.parseInt(splits[3].trim()));
                payments.add(payment);


                countReceiverMoney(payment);
                countSenderMoney(payment);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void fillPersonsData() {
        try (BufferedReader br = new BufferedReader(new FileReader(PERSON_FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(ID)) {
                    continue;
                }
                String[] splits = line.split(REGEX);
                if (splits.length < 3) {
                    continue;
                }
                int id = Integer.parseInt(splits[0]);
                persons.put(id, new PersonTeacher(id, splits[1].trim(), splits[2].trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void countReceiverMoney(Payment payment) {
        PersonTeacher person = persons.get(payment.receiverId());
        if (person != null) {
            person.setReceivedMoney(person.getReceivedMoney() + payment.sum());
        }
    }

    private void countSenderMoney(Payment payment) {
        PersonTeacher person = persons.get(payment.senderId());
        if (person != null) {
            person.setSentMoney(person.getSentMoney() + payment.sum());
        }
    }
}
