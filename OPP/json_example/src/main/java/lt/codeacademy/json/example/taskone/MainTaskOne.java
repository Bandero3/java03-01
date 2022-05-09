package lt.codeacademy.json.example.taskone;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;

public class MainTaskOne {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("person2.json");
        if(!file.exists()){
            file.createNewFile();
        }

        Payment payment = new Payment(new Sender("Anton", "J", 26), new Receiver("Jonas", "Jon", 37));

        mapper.writeValue(file,payment);

        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("payment.txt"))){
            ob.writeObject(payment);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ob = new ObjectInputStream(new FileInputStream("payment.txt"))){
            Payment readPayment = (Payment) ob.readObject();
            System.out.println(readPayment);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
