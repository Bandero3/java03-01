package dayone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite ka norite irasyti:");
        String input = scanner.nextLine();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))){
            bw.write(input);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
