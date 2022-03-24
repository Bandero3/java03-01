package daythree;

public class NewTaskThree {
    public static void main(String[] args) {
        Object one = new Object();
        Object two = new Object();
        Object three = new Object();

//        one = three;
//        two = one;
//        three = two;

        three = one;
        one = two;
        two = three;

        System.out.println(one == two);
        System.out.println(one == three);
        System.out.println(two == three);
        System.out.printf("%020d %s",5,5);
    }
}
