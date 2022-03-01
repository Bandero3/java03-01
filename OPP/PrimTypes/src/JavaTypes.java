// CTRL + ALT + L sulygiuoja koda
// CTRL + D pakopijuoja eilute
// sout -> System.out.println
// psvm arba main sukuria main metoda

public class JavaTypes {
    //Main Start application
    public static void main(String[] args) {

        byte byteType = 30;
        System.out.println("Byte: " + byteType);

        short shortType = 32000;
        System.out.println("Short: " + shortType);

        int intType = 100000000;
        System.out.println("Integer: " + intType);

        long longType = 10000000000000L;
        System.out.println("Long: " + longType);

        float floatType = 55.55846494F;
        System.out.println("Float: " + floatType);

        double doubletType = 55.55846494;
        System.out.println("Double: " + doubletType);

        char charType = 'A';
        System.out.println("Char: " + charType);

        boolean boleanType = false;
        System.out.println("Boolean: " + boleanType);

        int value = 10;
        System.out.println(value);
        System.out.println(value++);
        System.out.println(++value);

        int x = 9;
        int y = 2;
        float z = x / y;
        System.out.println(z);

        float d = x%y;
        System.out.println(d);

        int valueB = 5;
        System.out.println(valueB--);
        System.out.println(--valueB);

        int valueC = 5;

        //valueC = valueC +2;
        //System.out.println(valueC);

        valueC+=2;
        System.out.println(valueC);

        int a = 10;
        double b = 5.5;
        int c = 10;
        int sum =  a + (int)(b) + c;
        System.out.println(sum);

        double result = (a+b)*c;
        System.out.println(result);

    }
}
