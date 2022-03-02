package day.three;

public class OperatorExample {
    public static void main(String[] args) {
        boolean first = true;
        boolean second = false;

        int a = 2;
        int b = 5;

        String text = "aa";
        String secondText = "ab";

        System.out.println(!first); // false
        System.out.println(!second && !first); //false

        System.out.println(a == b); // false
        System.out.println(a <= b); //true
        System.out.println(a != b); // true
        System.out.println(a < b || b !=a); //true
        System.out.println(a == b || b >=a); // true
        System.out.println(a == b && b >=a); // false

        System.out.println(text.equals(secondText)); //false
        System.out.println(!text.equals(secondText)); //true

        System.out.println(a > b || text.equals(secondText) || first || !second); // true
        System.out.println(a > b || text.equals(secondText) || (first && !second)); // true

    }
}
