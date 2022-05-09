package lt.codeacademy.bank;

public class Person {
    private final int id;
    private final String name;
    private final String surName;
    private static int counter = 0;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
        id=counter++;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
