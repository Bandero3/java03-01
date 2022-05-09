package daytwo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        HashMap<Integer, Person> people = new HashMap<>();
        PersonMain task = new PersonMain();
        task.readPeopleFile(people);
        task.readPaymentFile(people);
        task.writeReceivedMoney(people);
    }

    public void writeReceivedMoney(HashMap<Integer, Person> people){
        for(Integer i: people.keySet()){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("moneyreceived.txt",true))){
                bw.write(people.get(i).toString() + " " + people.get(i).getReceivedMoney());
                bw.newLine();
                bw.flush();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    private void readPeopleFile(HashMap<Integer, Person> people){
        try(BufferedReader br = new BufferedReader(new FileReader("people.txt"))){
            String line = br.readLine();
            while((line = br.readLine()) != null){
                String[] personData = line.split(",");
                Person person = new Person(personData[1].trim(),personData[2].trim());
                people.put(Integer.parseInt(personData[0]),person);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void readPaymentFile(HashMap<Integer, Person> people){
        try(BufferedReader br = new BufferedReader(new FileReader("payment.txt"))){
            String line = br.readLine();
            while((line = br.readLine()) != null){
                String [] paymentData = line.split(",");

                int sum = Integer.parseInt(paymentData[1].trim());
                int receiverID = Integer.parseInt(paymentData[2].trim());
                int senderID = Integer.parseInt(paymentData[3].trim());

                Person person = people.get(receiverID);
                if(person != null){
                    person.setReceivedMoney(person.getReceivedMoney() + sum);
                }
                person = people.get(senderID);
                if(person != null){
                    person.setSentMoney(person.getSentMoney() + sum);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
