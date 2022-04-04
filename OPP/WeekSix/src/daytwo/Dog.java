package daytwo;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("woof woof");
    }

    @Override
    public int getAge() {
        return 12;
    }
}
