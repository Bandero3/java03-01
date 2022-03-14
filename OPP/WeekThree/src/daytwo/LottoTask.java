package daytwo;

import java.util.Scanner;

public class LottoTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite lotto nr:");
        String line = scanner.nextLine();

        if(line.length() != 6){
            System.out.println("Neteisingas loterijos bilieto numeris");
            return;
        }
        LottoTask task = new LottoTask();
        int[] mass = task.createNumberMass(line);

        if(task.hasDuplicatedNumber(mass)){
            System.out.println("Skaiciai kartojasi");
            return;
        }
        if(task.isWinNumbers(mass)){
            System.out.println("Sveikiname laimejote");
        }else{
            System.out.println("Bandykite dar karta");
        }

    }

    private int[] createNumberMass(String line) {
//        char[] chars = line.toCharArray();
        String[] splits = line.split("");
        int[] mas = new int[line.length()];
        for (int i = 0; i < splits.length; i++) {
            mas[i] = Integer.parseInt(splits[i]);
        }
        return mas;
    }

    private boolean hasDuplicatedNumber(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if(mass[i] == mass[j]){
                    return true;
                }

            }
        }
        return false;
    }

    private boolean isWinNumbers(int[] mass){
        int first = 0;
        int second =0;

        for(int i =0; i< mass.length/2; i++){
            first += mass[i];
        }

        return first == second;
    }
}
