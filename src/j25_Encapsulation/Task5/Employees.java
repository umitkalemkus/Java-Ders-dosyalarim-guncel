package j25_Encapsulation.Task5;

public class Employees {

    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


}
