package core.assignments.assignment02.task1Employee;

import java.util.Scanner;

public class Employee extends Person{
    String emp_id;
    String designation;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.createEmployee();
    }

    private void createEmployee() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter employee id:");
        this.emp_id = scn.nextLine();
        System.out.print("Enter designation:");
        this.designation = scn.nextLine();
        scn.close();
    }

    public String getLastName() {
        return this.lastName + this.designation;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee : " + this.emp_id);
        System.out.println("EMPLOYEE : " + this.getFirstName() + " " + this.getLastName());
    }
}
