package day.three;

public class IfExample {
    public static void main(String[] args) {


        if (true) {
            System.out.println("True");
        }
        int a = 10;
        int b = 20;

        if (a != b) {
            System.out.println("Skaiciai nera lygus");
        }
        // nerekomenduotina!
        if (b >= 22)
            System.out.println("Yra 20");
        System.out.println("Cia ir mano salyga");


        if (isNumberBigger(a, b)) {
            System.out.println("Yra didesnis");
        }

        if(nullValue()!=null){
            System.out.println("Ne null");
        }
    }

    private static boolean isNumberBigger(int a, int b) {
        return a > b;
    }

    private static String nullValue() {
        return "";
    }
}
