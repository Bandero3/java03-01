package lt.codeacademy.data;

import lt.codeacademy.Budget;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class File {
    private static final String FILE_NAME = "BudgetRecords.csv";

    public void saveData(List<Entry> entries){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Entry entry: entries){
                if(entry instanceof Income income){
                    bw.write("P," + income.getIndex() +"," + income.getSum() + "," + income.getIncomeCategory() + "," + income.getDate());
                    bw.newLine();
                } else if(entry instanceof Cost cost){
                    bw.write("I," + cost.getIndex() +"," + cost.getSum() + "," + cost.getCostCategory() + "," + cost.getCostTypes()+ "," + cost.getDate());
                    bw.newLine();
                }
            }
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readData(List<Entry> entries, Budget budget){
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line = br.readLine()) != null){
                String[] splits = line.split(",");
                if(splits[0].equals("I")){
                    budget.addEntry(new Cost(new BigDecimal(splits[2]), LocalDateTime.now(), TransferStatus.DONE, CostTypes.valueOf(splits[4]), CostCategory.valueOf(splits[3])));
                } else if(splits[0].equals("P")){
                    budget.addEntry(new Income(new BigDecimal(splits[2]), LocalDateTime.now(), new Person("Andrius", "Baltrunas"), TransferStatus.DONE, true, IncomeCategory.valueOf(splits[3])));
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
