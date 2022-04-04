package lt.codeacademy.data;

import lt.codeacademy.Budget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

//Dasideti galimybe gauti informacija islaidas apie pajamas pasirasyti metodeli kuris gauna informacija apie islaidas
// suranda norimas islaidas pagal categorija i data
// vartotojas labiau papildo informacija apie norimas islaidas

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget();
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String action;

        do{
            main.menu();
            action = scanner.nextLine();
            main.selectAction(action,budget,scanner);

        }while(!action.equals("5"));

    }

    private void selectAction(String action, Budget budget, Scanner scanner){
        switch(action){
            case "1" -> createCost(scanner, budget);
            case "2" -> createIncome(scanner, budget);
            case "3" -> getCost(scanner, budget);
            case "4" -> getIncome(scanner, budget);
            case "5" -> System.out.println("Programa baige darba");
            case "6" -> System.out.printf("Jusu balansas yra: %.2f\n",budget.balance());
            case "7" -> showCosts(budget);
            case "8" -> showIncomes(budget);
            case "9" -> removeCost(scanner,budget);
            case "10" -> removeIncome(scanner,budget);
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void menu(){
        System.out.println("""
                1. Ivesti islaidas
                2. Ivesti pajamas
                3. Gauti islaidas
                4. Gauti pajamas
                5. Pabaiga
                6. Balansas
                7. Visos islaidos
                8. Visos pajamos
                9. Istrinti islaidas
                10. Istrinti pajamas""");
    }

    private void createCost(Scanner scanner, Budget budget){
        System.out.println("Iveskite islaidu suma");
        String sum = scanner.nextLine();
        System.out.printf("Iveskite islaidu kategorija: %s\n", Arrays.toString(CostCategory.values()));
        String category = scanner.nextLine();
        System.out.printf("Iveskite islaidu tipa: %s\n", Arrays.toString(CostTypes.values()));
        String type = scanner.nextLine();
        budget.addEntry(new Cost(new BigDecimal(sum), LocalDateTime.now(), TransferStatus.DONE, CostTypes.valueOf(type),CostCategory.valueOf(category)));
    }

    private void createIncome(Scanner scanner, Budget budget){
        System.out.println("Iveskite pajamu suma");
        String value = scanner.nextLine();
        System.out.printf("Iveskite pajamu kategorija: %s\n", Arrays.toString(IncomeCategory.values()));
        String category = scanner.nextLine();
        budget.addEntry(new Income(new BigDecimal(value), LocalDateTime.now(), new Person("Andrius", "Baltrunas"), TransferStatus.DONE, true, IncomeCategory.valueOf(category)));
    }

    private void getCost(Scanner scanner, Budget budget){
        System.out.printf("Iveskite islaidu kategorija: %s\n", Arrays.toString(CostCategory.values()));
        String category = scanner.nextLine();
        System.out.println("Iveskite data 2022:03:17");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Cost cost = budget.getCost(CostCategory.valueOf((category)), localDate);
        System.out.println(cost);
    }

    private void getIncome(Scanner scanner, Budget budget){
        /*System.out.printf("Iveskite pajamu kategorija: %s\n", Arrays.toString(IncomeCategory.values()));
        String category = scanner.nextLine();
        System.out.println("Iveskite data 2022:03:17");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Income income = budget.getIncome(IncomeCategory.valueOf((category)), localDate);
        System.out.println(income);*/
        System.out.println("Iveskite pajamu kategorija is: " + Arrays.toString(IncomeCategory.values()));
        String text = scanner.nextLine();
        IncomeCategory category = IncomeCategory.valueOf(text);

        System.out.println("Iveskite data, pvz: 2022.02.21");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate = LocalDate.parse(date,formatter);
        Income income = budget.getIncome(category,localDate);
        System.out.println(income);
    }

    private void showIncomes(Budget budget){
        for(Entry i: budget.getIncomes()){
            System.out.println(i);
        }
    }
    private void showCosts(Budget budget){
        for(Entry c: budget.getCosts()){
            System.out.println(c);
        }
    }

    private void removeIncome(Scanner scanner, Budget budget){
        System.out.println("Iveskite indexa kuri norite istrinti");
        int index = Integer.parseInt(scanner.nextLine());
        budget.removeIncome(index);
    }
    private void removeCost(Scanner scanner, Budget budget){
        System.out.println("Iveskite indexa kuri norite istrinti");
        int index = Integer.parseInt(scanner.nextLine());
        budget.removeCost(index);
    }

}