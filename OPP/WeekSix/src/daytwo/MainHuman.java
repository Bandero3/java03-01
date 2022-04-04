package daytwo;

public class MainHuman {
    public static void main(String[] args) {
        Human human = new Studentas("Tadas", "Blinda");
        Human human1 = new Teacher("Andrius", "Baltrunas");

        human.printInformation();
        human1.printInformation();

        System.out.println(human);
        System.out.println(human1);

    }
}
