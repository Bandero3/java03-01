package lt.codeacademy.json.example.taskthree;

public class Company {
    private String name;
    private String companyCode;
    private int employeeNumber;
    private int averageSalary;


    public Company(String name, String companyCode, int employeeNumber, int averageSalary) {
        this.name = name;
        this.companyCode = companyCode;
        this.employeeNumber = employeeNumber;
        this.averageSalary = averageSalary;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(int averageSalary) {
        this.averageSalary = averageSalary;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", averageSalary=" + averageSalary +
                '}';
    }
}
