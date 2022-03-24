package dayfour;

public class TaskOne {
    public static void main(String[] args) {
        String text = String.format("Asmens %s %s, gimusio %dm., ūgis yra %.2fm.","Petro", "Petraicio", 1977, 1.9);
        System.out.println(text);

        String anotherText = String.format("|%20s|\n|%20s|\n|%20s|\n|%20s|\n|%-20s|\n","As", "tikrai", "ismoksiu", "programuoti", "JAVA");
        System.out.println(anotherText);
    }
}
