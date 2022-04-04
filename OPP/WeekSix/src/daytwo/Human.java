package daytwo;

public abstract class Human {
    private final String name;
    private final String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void printInformation();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


class Studentas extends Human{
    public Studentas(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInformation() {
        System.out.printf("Studentas - Vardas: %s Pavarde: %s\n",getName(),getSurname());
    }

}

class Teacher extends Human{

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInformation() {
        System.out.printf("Destytojas - Vardas: %s Pavarde: %s\n",getName(),getSurname());
    }
}