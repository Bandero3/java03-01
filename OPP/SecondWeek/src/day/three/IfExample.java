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
        }else{
            System.out.println("Ivesta reiksme yra null");
        }

        if(a > b){
            System.out.println("a > b");
        }else if(a != b && b < 50){
            System.out.println("10 !=20");

        }else if(a < b){
            System.out.println("10 < 20");

        }else{
            System.out.println("Neatitiko jokios salygos");
        }
        // new one line if
        int result = a > b ? 50 : 100;
        System.out.println("result " + result);

/*        if (a>b){
            result = 50;
        }else{
            result = 100;
        }*/
    }


    private static boolean isNumberBigger(int a, int b) {
        return a > b;
    }

    private static String nullValue() {
        return null;
    }
}
