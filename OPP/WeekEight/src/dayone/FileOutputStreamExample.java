package dayone;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite ka norite irasyti:");
        String line = scanner.nextLine();

        File file = new File("output.txt");
        if(file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(FileOutputStream outputStream = new FileOutputStream(file, true)){
            for(int i = 0; i < line.length(); i++){
                outputStream.write(line.charAt(i));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
