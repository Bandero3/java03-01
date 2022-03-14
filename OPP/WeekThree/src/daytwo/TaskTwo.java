package daytwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        TaskTwo taskTwo = new TaskTwo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite bileto skaicius");
        String line = scanner.nextLine();
        char [] a = taskTwo.eachNumber(line);
        System.out.println(taskTwo.isLucky(a));
//        for(int i =0; i < line.length(); i++){
//            System.out.println(taskTwo.eachNumber(line)[i]);
//        }
//        for(int i =0; i < a.length; i++){
//            System.out.println(a[i]);
//        }

    }

    private char[] eachNumber(String line){
        char [] number = new char[line.length()];
        for(int i = 0; i < number.length; i++){
            number[i] = line.charAt(i);
        }
        return number;
    }

    private boolean isLucky(char [] numb){
        int firsthalf=0;
        int secondhalf=0;
        for(int i= 0; i< numb.length/2; i++){
            firsthalf+=numb[i];
            secondhalf+=numb[numb.length-1-i];
        }
//        if(firsthalf == secondhalf){
//            return true;
//        }
//        return false;
        return firsthalf == secondhalf;
    }

}
