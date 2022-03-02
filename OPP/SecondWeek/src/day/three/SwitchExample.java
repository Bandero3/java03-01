package day.three;

public class SwitchExample {
    public static void main(String[] args) {
        int value = 3;

        switch(value){
            case 1:
                System.out.println("Tai 1");
                break;
            case 2:
                System.out.println("Tai 2");
                break;
            case 3:
                System.out.println("Tai 3");
            default:
                System.out.println("Neradom");
                break;
        }

        //new switch case pattern
        switch(value){
            case 1 -> {
                System.out.println("Tai 1");
            }
            case 2 -> System.out.println("Tai 2");
            case 3 -> System.out.println("Tai 3");
            default -> System.out.println("Neradom");

        }
    }
}
