package lt.codeacademy.json.example.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MainJsonExample {
    public static void main(String[] args) throws IOException {
        // reikalingas json serialize/deserialize objektams
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT); //suformatuot json faila

        File file = new File("persons.json");
        if(!file.exists()){
            file.createNewFile();
        }

        Person person = new Person("Andrius", null, 33, new Address("Vilnius", "LT","Savanoriu pr."));
        Person secondPerson = new Person("Jonas", "Jonaitis", 63, new Address("Klaipeda", "LT","Neptuno g."));
        mapper.writeValue(file,person);

        person = mapper.readValue(file,Person.class);
        System.out.println(person);

        String personAsString = mapper.writeValueAsString(person);
        System.out.println(personAsString);

        person = mapper.readValue(personAsString,Person.class);
        System.out.println(person);

        List<Person> persons = List.of(person,secondPerson, person);
        mapper.writeValue(file,persons);

        persons = mapper.readValue(file, new TypeReference<>(){});
        persons.forEach(System.out::println);

        Map<String, Object> personMap = mapper.readValue(personAsString, new TypeReference<>() {});
        System.out.println(personMap.get("name"));
        System.out.println(personMap);
    }
}
