package daytwo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Driver> cars = new ArrayList<>();

        Driver driver1 = new Driver("Antanas", "Audi", "aaa111", 10000);
        Driver driver2 = new Driver("Petras", "Opel", "bbb222", 20000);
        Driver driver3 = new Driver("Jonas", "BMW", "ccc333", 30000);

        cars.add(driver1);
        cars.add(driver2);
        cars.add(driver3);
        Main main = new Main();
        main.saveToFile(cars);


    }

    private void saveToFile(List<Driver> cars) {
        for (Driver driver : cars) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("newoutput.cvs", true))) {
                bw.write(String.valueOf(driver));
                /*bw.write(driver.getName());
                bw.write(", ");
                bw.write(driver.getCar());
                bw.write(", ");
                bw.write(driver.getPlateNumb());
                bw.write(", ");
                bw.write(Integer.toString(driver.getRida()));*/
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
