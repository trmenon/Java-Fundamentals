package core.examples.employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        emp1.setAge(32);
        emp1.setDesignation("Manager");
        emp1.setSalary(1250000.00);
        emp1.displayEmployeeDetails();
    }
}
