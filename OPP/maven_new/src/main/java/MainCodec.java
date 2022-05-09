import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Scanner;

public class MainCodec {
    HashMap<String, String> logins = new HashMap<>();
    private boolean app = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainCodec task = new MainCodec();


        while (task.app) {
            task.meniu();
            String action = scanner.nextLine();
            task.makeChoice(scanner, action);
        }

    }

    private void meniu() {
        System.out.println("""
                Pasirinkite veiksma
                [1]. Registruotis
                [2]. Prisijungti
                [3]. Uzdaro programa""");

    }

    private void makeChoice(Scanner scanner, String action) {
        switch (action) {
            case "1" -> register(scanner);
            case "2" -> login(scanner);
            case "3" -> {
                app = false;
                System.out.println("Programa baige darba");
            }
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void register(Scanner scanner) {
        System.out.println("Iveskite vartorojo varda");
        String name = scanner.nextLine();
        System.out.println("Iveskite slaptazodi");
        String password = DigestUtils.sha256Hex(scanner.nextLine());
        System.out.println("Iveskite slaptazodi pakartotinai");
        String repeatPassowrd = DigestUtils.sha256Hex(scanner.nextLine());
        if (!password.equals(repeatPassowrd)) {
            System.out.println("Blogai pakartojote slaptazodi");
            return;
        }
        logins.put(name, password);
        System.out.println(logins);
    }

    private void login(Scanner scanner) {
        System.out.println("Iveskite vartotojo varda");
        String name = scanner.nextLine();
        String password = logins.get(name);
        if (password == null) {
            System.out.println("Tokio vartotojo nera");
            return;
        }
        System.out.println("Iveskite slaptazodi");
        String enteredPassword = DigestUtils.sha256Hex(scanner.nextLine());
        if (!password.equals(enteredPassword)) {
            System.out.println("Ivestas blogas slaptazodis");
        } else {
            System.out.println("Prisijungete");
        }
    }
}
