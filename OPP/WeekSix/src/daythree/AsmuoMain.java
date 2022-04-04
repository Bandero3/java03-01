package daythree;

import java.util.List;

public class AsmuoMain {
    public static void main(String[] args) {
        Studentas student = new Studentas("Tadas", "Blinda");

        Studentas student2 = new Studentas("Tadas", "Blinda");

        Destytojas destytojas = new Destytojas("Tadas", "Blinda");

        Asmuo asmuo = new Destytojas("Tadas", "Blinda");

        student.printInformation();
        asmuo.printInformation();

        boolean uniqueList = asmuo.AsmensMetodas(List.of(student,student2));
        System.out.println(uniqueList);
    }
}
