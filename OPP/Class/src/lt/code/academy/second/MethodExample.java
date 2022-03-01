package lt.code.academy.second;

public class MethodExample {

    public static void main(String[] args) {

        MethodExample methodExample = new MethodExample();
        methodExample.firstMethod();
        System.out.println(methodExample.text(5));
        methodExample.PrintUserAge(19);

        // static metodas kitoje klaseje
        double speed = StaticMethodInAnotherClass.getSpeed();
        System.out.println(speed);

    }

    public int text(int a){
        return a;
    }

    public void firstMethod(){
        System.out.println("Hi");
        System.out.println(getAge());
        System.out.println(StaticMethodInAnotherClass.getSpeed());
    }

    public int getAge(){
        return 100;
    }

    public void PrintUserAge (int name){
        System.out.println("Age: " + name);
    }
}
