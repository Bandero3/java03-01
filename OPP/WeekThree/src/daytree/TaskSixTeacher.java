package daytree;

import java.util.Arrays;

public class TaskSixTeacher {
    public static void main(String[] args) {
        int[] mass = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] newMass = new int[mass.length];

        for (int i = 0; i < mass.length; i++) {
            newMass[i] = mass[i];
        }

        System.out.println(Arrays.toString(newMass));
    }
}
