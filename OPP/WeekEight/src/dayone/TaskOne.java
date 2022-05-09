package dayone;

import java.io.*;

public class TaskOne {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("vardas.txt"))){
            String line;
            while((line = br.readLine()) != null){
                StringBuilder sb = new StringBuilder(line);
                sb.reverse();
                try(BufferedWriter bw = new BufferedWriter(new FileWriter("kitasfailas.txt", true))){
                    bw.write(sb.toString());
                    bw.newLine();
                    bw.flush();
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
