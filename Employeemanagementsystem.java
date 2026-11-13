
abstract class Employee {
    String name;
    int empId;
    double salary;

    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empId = empID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empId;
    }
    public double getSalary() {
        return salary;
    }
    abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + calculateSalary());
        System.out.println("----------------------");
    }
}
class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int empID, double salary) {
        super(name, empID, salary);
    }
    double calculateSalary() {
        return salary;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    PartTimeEmployee(String name, int empID,double hourlyRate, int hoursWorked) {
        super(name, empID, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
    class Employeemanagementsystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ravi", 101, 30000);
        Employee e2 = new FullTimeEmployee("Ramu", 103, 35000);
        Employee e3 = new PartTimeEmployee("Raj", 104, 200, 50);
        Employee[] employees = {e1, e2, e3};
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
