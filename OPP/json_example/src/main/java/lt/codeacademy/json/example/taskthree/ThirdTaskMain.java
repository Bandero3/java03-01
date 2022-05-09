package lt.codeacademy.json.example.taskthree;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThirdTaskMain {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        ThirdTaskMain task = new ThirdTaskMain();


        File file = new File("company_list.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        List<TeacherCompany> companies = task.generateCompanies();

        objectMapper.writeValue(file,companies);
    }

    private List<TeacherCompany> generateCompanies(){
        Faker faker = new Faker();
        List<TeacherCompany> companies = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            companies.add(new TeacherCompany(faker.company().name(), faker.code().asin(), faker.number().numberBetween(10, 500), (double) faker.number().numberBetween(1500, 10500)));
        }
        return companies;
    }
}
