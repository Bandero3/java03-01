package daytwo;

public class Main4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.printInfo();

        Animal animal = new Cat();
        animal.sound();
        animal.printInfo();

       /* Animal animal1 = new Animal() {
            @Override
            public void sound() {
                System.out.println("Inline");
            }
        };
        animal1.sound();*/
    }
}
