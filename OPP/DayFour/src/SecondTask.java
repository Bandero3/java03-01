public class SecondTask {
    public static void main(String[] args) {
        Employee petras = new Employee(5000, 110,"Petras", "Daugumedis");
        petras.addWorkHours(10);
        petras.increaseSalary();
        petras.increaseSalary();
        System.out.println(petras.getEmployeeInfo());
        Employee antanas = new Employee("Antanas", "Januskevic");
        System.out.println(antanas.getEmployeeInfo());
    }
}
