package day.four;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] mass = new int[10];
        mass[0] = 10;
        mass[1] = 15;

        System.out.println(mass.length);
        System.out.println(mass[5]);
        System.out.println(mass[0]);
        System.out.println(mass[1]);

        int[] secondMas= {55,4,5,5,8,7,47};
        System.out.println(secondMas.length);
        System.out.println(secondMas[3]);

        int [][] matrix = new int[10][5];
        matrix[5][1]=55;
        System.out.println(matrix[5][1]);

        String[][] stringMatrix = {
                {"As","Tu","Jis"},
                {"Mes", "Jie"}
        };

        System.out.println(stringMatrix[1][1]);

        //System.arraycopy();
        //Arrays.copyOf();
    }
}
