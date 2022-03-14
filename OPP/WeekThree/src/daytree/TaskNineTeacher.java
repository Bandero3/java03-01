package daytree;

import java.util.Arrays;

public class TaskNineTeacher {
    public static void main(String[] args) {
        int[] mas = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457,2456};
        int[] newMas = new int[mas.length];

        for(int i=0; i < mas.length; i++){
            newMas[newMas.length-1-i] = mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(newMas));
    }


}
