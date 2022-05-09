package lt.codeacademy.json.example.taskthree;

public class TeacherCompany {
    private String name;
    private String code;
    private int employers;
    private Double salaryAverage;

    public TeacherCompany(String name, String code, int employers, Double salaryAverage) {
        this.name = name;
        this.code = code;
        this.employers = employers;
        this.salaryAverage = salaryAverage;
    }


    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getEmployers() {
        return employers;
    }

    public Double getSalaryAverage() {
        return salaryAverage;
    }
}
