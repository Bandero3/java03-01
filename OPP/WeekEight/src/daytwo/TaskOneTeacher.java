package daytwo;

import java.io.*;

public class TaskOneTeacher {
    private static final String NAME_FILE = "name.txt";
    private static final String REVERSED_NAME_FILE = "reversed_name.txt";

    public static void main(String[] args) {
        TaskOneTeacher task = new TaskOneTeacher();
        try {
            File file = task.createFile(NAME_FILE);
            String fullName = task.readFile(file);

            if(fullName == null){
                return;
            }

            String [] splitFullName = fullName.split(" ");
            String reversedName = task.reverseText(splitFullName[0]);
            String reversedSurname = task.reverseText(splitFullName[1]);

            File reversedFile = task.createFile(REVERSED_NAME_FILE);
            task.writeToFile(reversedFile, reversedName + " " + reversedSurname);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String reverseText(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        return sb.toString();
    }

    private String readFile(File file){
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            return br.readLine();
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private void writeToFile(File file, String text){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(text);
            bw.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private File createFile(String fileName) throws IOException {
        File file = new File(fileName);

        if(!file.exists()){
            file.createNewFile();
        }
        return file;
        }
    }
