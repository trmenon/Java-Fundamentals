package core.examples.employee;

public class Employee {
    String name;
    int age;
    String designation;
    Double salary;

    public Employee(String empName) {
        this.name = empName;
    }

    public void setAge(int empAge) {
        this.age = empAge;
    }
    public void setDesignation(String empDesignation) {
        this.designation = empDesignation;
    }
    public void setSalary(Double empSalary) {
        this.salary = empSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}
