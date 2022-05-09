package daytwo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TaskTwoTeacher {
    public static void main(String[] args){

        TaskTwoTeacher task = new TaskTwoTeacher();

        File file = task.createFile();
        if (file == null) {
            return;
        }

        List<Vairuotojas> vairuotojai = List.of(new Vairuotojas("Petras", "Volvo", "ABC123", 190000),
                new Vairuotojas("John", "Audi", "ACB321", 25000));


        task.write(file, vairuotojai);
    }

    private File createFile() {
        File file = null;
        try {
            file = new File("drivers.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private void write(File file, List<Vairuotojas> drivers) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Vairuotojas vairuotojas : drivers) {
                bw.write(vairuotojas.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
