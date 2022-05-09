package lt.codeacademy.json.example.taskthree;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    List<Company> companies = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Main task = new Main();

        task.FillCompanyList();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new java.io.File("imoniu_sarasas.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        task.SerializeCompaniesToJson(objectMapper, file);

    }

    private void SerializeCompaniesToJson(ObjectMapper objectMapper, File file) throws IOException {
        objectMapper.writeValue(file, companies);
    }

    private void FillCompanyList() {
        Faker faker = new Faker();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = faker.company().name();
            String companyCode = faker.code().asin();
            int employeeNumber = random.nextInt(10, 100);
            int averageSalary = random.nextInt(1000, 5000);
            companies.add(new Company(name, companyCode, employeeNumber, averageSalary));
        }
    }
}
