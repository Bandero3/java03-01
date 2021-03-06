package daytwo;

public class Person {
    private final String name;
    private final String surname;
    private final String personCode;

    public Person(String name, String surname, String personCode) {
        this.name = name;
        this.surname = surname;
        this.personCode = personCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonCode() {
        return personCode;
    }

    public String printInfo(){
        return String.format("Vardas: %s Pavarde: %s PersonCode: %s",name,surname,personCode);
    }


}
