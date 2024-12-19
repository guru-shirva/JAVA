package pkg2;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increment = salary * (percent / 100);
            salary = salary + increment;
            System.out.println("New Salary: " + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Pjk3 {
    public static void main(String[] args) {
        Employee Suresh = new Employee(1, "Suresh", 10000);
        Suresh.showEmployeeDetails();
        Suresh.raiseSalary(20);
        Suresh.showEmployeeDetails();
    }
}
