package daythree;

public class NewTaskOne {
    public static void main(String[] args) {
        String zodis = "Zodis";
        String zodis2 = "Zodis";

        if(zodis == zodis2){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (zodis.equals(zodis2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        String zodis3 = new String("Zodis");
        String zodis4 = new String("Zodis");

        if(zodis3 == zodis4){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (zodis3.equals(zodis4)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        String zodis5 = "Zodis1";
        String zodis6 = "Zodis2";

        if(zodis5 == zodis6){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (zodis5.equals(zodis6)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        zodis5 = zodis6;

        if(zodis5 == zodis6){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (zodis5.equals(zodis6)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
