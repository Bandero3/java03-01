package daytwo;

public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Miau");
    }

    @Override
    public int getAge() {
        return 10;
    }
}
