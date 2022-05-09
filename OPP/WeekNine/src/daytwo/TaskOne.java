package daytwo;

import java.time.LocalDate;

public class TaskOne {
    public static void main(String[] args) {
        TaskOne task = new TaskOne();
        LocalDate localDate = LocalDate.now();
        task.printStuff(localDate);
        task.printStuff(localDate, 5, "Hello");
        task.printStuff(localDate, "Bye", 'H', 56.57);
        task.printStuff(localDate, "Bye", 'H', 56.57, new VarArgsExample());
    }

    private void printStuff(Object... objects){
        for(Object object: objects){
            System.out.println(object.toString());
        }
        System.out.println("----------------------");
    }
}
