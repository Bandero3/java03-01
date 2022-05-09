package lt.codeacademy.data;

import lt.codeacademy.Budget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//Dasideti galimybe gauti informacija islaidas apie pajamas pasirasyti metodeli kuris gauna informacija apie islaidas
// suranda norimas islaidas pagal categorija i data
// vartotojas labiau papildo informacija apie norimas islaidas

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget();
        File file = new File();
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String action;

        do {
            main.menu();
            action = scanner.nextLine();
            main.selectAction(action, budget, scanner, file);

        } while (!action.equals("5"));

    }

    private void selectAction(String action, Budget budget, Scanner scanner, File file) {
        switch (action) {
            case "1" -> createCost(scanner, budget);
            case "2" -> createIncome(scanner, budget);
            case "3" -> getCost(scanner, budget);
            case "4" -> getIncome(scanner, budget);
            case "5" -> System.out.println("Programa baige darba");
            case "6" -> System.out.printf("Jusu balansas yra: %.2f\n", budget.balance());
            case "7" -> showCosts(budget);
            case "8" -> showIncomes(budget);
            case "9" -> removeCost(scanner, budget);
            case "10" -> removeIncome(scanner, budget);
            case "11" -> updateIncome(scanner, budget);
            case "12" -> file.saveData(budget.entries);
            case "13" -> file.readData(budget.entries, budget);
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void updateIncome(Scanner scanner, Budget budget) {
        System.out.println("Iveskite indexa pajamu kurias norite atnaujinti");
        int id = enterIndex(scanner);
        Income income = budget.findIncome(id);

        if (income == null) {
            System.out.printf("Pajamu pagal id:%d nerasta, patikrinkite id\n", id);
            return;
        }


        String newSum = getNewValue("Suma %.2f", income.getSum().doubleValue(), scanner);
        income.setSum(newSum != null ? new BigDecimal(newSum) : income.getSum());
        String newName = getNewValue("Person name %s", income.getPerson().getName(), scanner);
        income.getPerson().setName(newName != null ? newName : income.getPerson().getName());

    }

    private String getNewValue(String template, Object object, Scanner scanner) {
        System.out.printf(template + "\n", object);
        System.out.println("1 - redaguoti, 2 - toliau");
        String action = scanner.nextLine();

        if (action.equals("1")) {
            System.out.println("Iveskite nauja reiksme:");
            return scanner.nextLine();
        }
        return null;
    }

    private void menu() {
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
                10. Istrinti pajamas
                11. Atnaujinti pajamas
                12. Issaugoti duomenys i faila
                13. Gauti duomenys is failo""");
    }

    private void createCost(Scanner scanner, Budget budget) {
        System.out.println("Iveskite islaidu suma");
        double sum = enterSum(scanner);
        String category = enterCostCategory(scanner);
        String type = enterCostType(scanner);
        budget.addEntry(new Cost(new BigDecimal(sum), LocalDateTime.now(), TransferStatus.DONE, CostTypes.valueOf(type), CostCategory.valueOf(category)));
    }

    public String enterCostType(Scanner scanner) {
        while (true) {
            System.out.printf("Iveskite islaidu tipa: %s\n", Arrays.toString(CostTypes.values()));
            String type = scanner.nextLine().toUpperCase();
            if (!type.equals("CASH") && !type.equals("TRANSFER") && !type.equals("CARD")) {
                System.out.println("Blogai ivestas tipas, bandykite vel");
                continue;
            }
            return type;
        }
    }

    public String enterCostCategory(Scanner scanner) {
        while (true) {
            System.out.printf("Iveskite Islaidu kategorija: %s\n", Arrays.toString(CostCategory.values()));
            String category = scanner.nextLine().toUpperCase();
            if (!category.equals("FOOD") && !category.equals("GAS") && !category.equals("UTILITIES") && !category.equals("ENTERTAINMENT")) {
                System.out.println("Blogai ivesta kategorija, bandykite vel");
                continue;
            }
            return category;
        }
    }

    private double enterSum(Scanner scanner) {
        while (true) {
            try {
                double sum = Double.parseDouble(scanner.nextLine());

                if (sum <= 0) {
                    System.out.println("Suma turi buti didesne uz 0");
                    continue;
                }
                return sum;
            } catch (NumberFormatException e) {
                System.out.println("Blogai ivesta suma, bandykite vel");
            }
        }
    }

    private void createIncome(Scanner scanner, Budget budget) {
        System.out.println("Iveskite pajamu suma");
        double value = enterSum(scanner);
        String category = enterIncomeCategory(scanner);
        budget.addEntry(new Income(new BigDecimal(value), LocalDateTime.now(), new Person("Andrius", "Baltrunas"), TransferStatus.DONE, true, IncomeCategory.valueOf(category)));
    }

    public String enterIncomeCategory(Scanner scanner) {
        while (true) {
            System.out.printf("Iveskite pajamu kategorija: %s\n", Arrays.toString(IncomeCategory.values()));
            String category = scanner.nextLine().toUpperCase();
            if (!category.equals("SALARY") && !category.equals("EXTRA_MONEY") && !category.equals("INCOME")) {
                System.out.println("Blogai ivesta kategorija, bandykite vel");
                continue;
            }
            return category;
        }
    }

    private void getCost(Scanner scanner, Budget budget) {
        String category = enterCostCategory(scanner);
        LocalDate localDate = enterDate(scanner);
        Cost cost = budget.getCost(CostCategory.valueOf((category)), localDate);
        System.out.println(cost);
    }

    public LocalDate enterDate(Scanner scanner){
        while(true){
            try{
                System.out.println("Iveskite data tokiu formatu yyyy-MM-dd");
                String date = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localDate = LocalDate.parse(date, formatter);
                return localDate;
            } catch (DateTimeParseException e){
                System.out.println("Blogai ivesta data, bandykite vel");
                continue;
            }
        }
    }

    private void getIncome(Scanner scanner, Budget budget) {
        String text = enterIncomeCategory(scanner);
        IncomeCategory category = IncomeCategory.valueOf(text);
        LocalDate localDate = enterDate(scanner);
        Income income = budget.getIncome(category, localDate);
        System.out.println(income);
    }

    private void showIncomes(Budget budget) {
        for (Entry i : budget.getIncomes()) {
            System.out.println(i);
        }
    }

    private void showCosts(Budget budget) {
        for (Entry c : budget.getCosts()) {
            System.out.println(c);
        }
    }

    private void removeIncome(Scanner scanner, Budget budget) {
        System.out.println("Iveskite indexa kuri norite istrinti");
        int index = enterIndex(scanner);
        budget.removeIncome(index);
    }

    private void removeCost(Scanner scanner, Budget budget) {
        System.out.println("Iveskite indexa kuri norite istrinti");
        int index = enterIndex(scanner);
        budget.removeCost(index);
    }

    private int enterIndex(Scanner scanner) {
        while (true) {
            try {
                int index = Integer.parseInt(scanner.nextLine());

                if (index < 0) {
                    System.out.println("Negali but neigiamas");
                    continue;
                }
                return index;
            } catch (NumberFormatException e) {
                System.out.println("Blogai ivestas indexas, bandykite vel");
            }
        }
    }

}
