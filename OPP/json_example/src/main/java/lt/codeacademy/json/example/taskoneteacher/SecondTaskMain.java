package lt.codeacademy.json.example.taskoneteacher;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class SecondTaskMain {

    private ObjectMapper objectMapper;
    private File file;

    public static void main(String[] args) throws IOException {
        SecondTaskMain task = new SecondTaskMain();
        task.objectMapper = new ObjectMapper();
        task.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        task.file = new File("payments.json");
        if(!task.file.exists()){
            task.file.createNewFile();
        }

        task.writePersonToFile();
        task.readPaymentsFromFile();
    }

    private void readPaymentsFromFile() throws IOException {
        List<Payment> payments = objectMapper.readValue(file, new TypeReference<List<Payment>>() {});
           for(Payment payment : payments){
                System.out.println();
            }
        }

    private void writePersonToFile() throws IOException {
        List<Payment> payments = List.of(new Payment(
                        new Sender("Andrius", "Baltrunas"),
                        new Receiver("Jonas", "Jonaitis")),
                new Payment(
                        new Sender("Ona","Onaite"),
                        new Receiver("Kazys", "Kaziukaitis"))
        );

        objectMapper.writeValue(file,payments);
    }
}
