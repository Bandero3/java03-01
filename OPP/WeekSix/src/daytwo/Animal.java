package daytwo;

public abstract class Animal {

    public abstract void sound();

    public abstract int getAge();

    public void testMethod(){
        System.out.println("This is simple method");
    }

    public void printInfo(){
        System.out.printf("Gyvuno amzius yra: %s\n",getAge());
    }
}
