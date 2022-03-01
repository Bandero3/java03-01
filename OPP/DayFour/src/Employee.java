public class Employee {
    private int salary;
    private int workHours;
    private final String name;
    private final String surname;

    public Employee(String name, String surname) {
        this(0,0, name, surname);
//        salary = 0;
//        workHours = 0;
    }

    public Employee(int salary, int workHours, String name, String surname) {
        this.salary = salary;
        this.workHours = workHours;
        this.name = name;
        this.surname = surname;
    }

    public void increaseSalary(){
        salary+=10;
    }

    public void addWorkHours(int hours){
        workHours+=hours;
    }

    public String getEmployeeInfo(){
        return String.format("%s %s hours: %s h, salary: %s eu",name, surname, workHours, salary);
    }
}
