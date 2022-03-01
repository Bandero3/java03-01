public class FirstTask {
    //ctrl + shif + / - comment block of code
    public static void main(String[] args) {
/*        Person person = new Person();
        person.name = "Andrius";
        person.surname = "Baltrunas";*/

/*        Person person = new Person();
        person.setName("Anton");
        person.setSurname("Januskevic");
        System.out.println(person.getName());
        System.out.println(person.getSurname());*/

        Person person = new Person("Anton", "Januskevic", 25);
        person.setAge(26);
        System.out.println(person);

        System.out.println(person.getNameAndSurname());
        System.out.println(person.getText("Java"));
    }
}
