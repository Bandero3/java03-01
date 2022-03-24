package daythree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskFourTeacher {
    private final Map<Integer, Student> students = new HashMap<>();
    public static void main(String[] args) {
        TaskFourTeacher task = new TaskFourTeacher();
        Scanner scanner = new Scanner(System.in);

        String action;
        do{
            task.showMenu();
            action = scanner.nextLine();
            task.callAction(action, scanner);
        }while(!action.equals("3"));
    }

    private void callAction(String action, Scanner scanner){
        switch(action){
            case "1" -> addStudent(scanner);
            case "2" -> getStudent(scanner);
            case "3" -> System.out.println("Programa baige darba");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void getStudent(Scanner scanner) {
        System.out.println("Iveskite norimo studento id");
        int studentId = Integer.parseInt(scanner.nextLine());
        Student student = students.get(studentId);

        if(student == null){
            System.out.printf("Studento su tokiu id %d nera\n",studentId);
        } else {
            System.out.println(student);
        }
    }

    private void addStudent(Scanner scanner) {
        int studentId = getUniqueStudentID(scanner);
        System.out.println("Iveskite studento varda");
        String name = scanner.nextLine();
        System.out.println("Iveskite studento pavarde");
        String surname = scanner.nextLine();
        System.out.println("Iveskite studento Universiteta");
        String university = scanner.nextLine();
        students.put(studentId, new Student(name,surname,university));

    }

    private int getUniqueStudentID(Scanner scanner){
        int studentId;
        boolean isContains;
        do{
            System.out.println("Iveskite studento id");
            studentId = Integer.parseInt(scanner.nextLine());
            isContains = students.containsKey(studentId);
            if(isContains){
                System.out.printf("Toks id egzistuoja %s\n",students.keySet());
            }

        } while(isContains);
        return studentId;
    }

    private void showMenu(){
        System.out.println("""
                [1] ivesti studenta
                [2] gauti studenta pagal numeri
                [3] baigti darba
                """); // ?
    }
}
