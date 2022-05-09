package daytwo;

public class Person {
    private final String name;
    private final String surname;
    private int receivedMoney;
    private int sentMoney;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.receivedMoney = 0;
        this.sentMoney = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(int receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public int getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(int sentMoney) {
        this.sentMoney = sentMoney;
    }
}
