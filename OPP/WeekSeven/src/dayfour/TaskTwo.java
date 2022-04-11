package dayfour;

public class TaskTwo {
    public static void main(String[] args) {
        boolean workday = false;
        boolean vacation = false;

        if (!workday || vacation) {
            System.out.println("Galima miegoti");
        } else {
            System.out.println("Negalima miegoti");
        }
    }
}
