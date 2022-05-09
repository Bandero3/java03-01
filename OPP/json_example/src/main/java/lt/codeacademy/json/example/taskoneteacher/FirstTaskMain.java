package lt.codeacademy.json.example.taskoneteacher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.codeacademy.json.example.json.Person;

import java.io.*;

public class FirstTaskMain {
    public static void main(String[] args) throws IOException {
       FirstTaskMain task = new FirstTaskMain();
       task.serializePerson();
       task.deserializePerson();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);


        File file = new File("person.json");
        if(!file.exists()){
            file.createNewFile();
        }

        mapper.writeValue(file, new Payment(new Sender("Jonas","Jonaitis"), new Receiver("Andrius","Baltrunas")));

        Payment payment = new Payment();

        payment = mapper.readValue(file, Payment.class);
        System.out.println(payment);

    }
    private void serializePerson(){
        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("person.txt"))){
            ob.writeObject(new Payment(new Sender("Jonas","Jonaitis"), new Receiver("Andrius","Baltrunas")));
            ob.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private void deserializePerson(){
        try(ObjectInputStream ob = new ObjectInputStream(new FileInputStream("person.txt"))){
            Object o = ob.readObject();
            if(o instanceof Payment payment){
                System.out.println(payment);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
