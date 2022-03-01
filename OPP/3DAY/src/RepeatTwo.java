public class RepeatTwo {
    private int age;

    public RepeatTwo(int age){
        this(age, 0);
    }

    public RepeatTwo(int age, int numb){
        this.age = age;
    }


    public static void main(String[] args) {

        RepeatTwo repeatTwo = new RepeatTwo(50,50);
        repeatTwo.m1();
    }

    private void m1(){
        int newAge = 10;
        System.out.println(age);
        m2(50);
    }

    private void m2(int value){
        System.out.println(value);
    }
}
