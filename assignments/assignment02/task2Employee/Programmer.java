package core.assignments.assignment02.task2Employee;

public class Programmer extends Employee{
    static int mult = 1000;
    String name;
    Address add;
    double salary;
    String designation;

    public Programmer(
        String projectId, 
        int emp_id,
        String name,
        String addLine1,
        String addLine2,
        String city,
        String country,
        double sal,
        String des
    ) {
        super(projectId, emp_id);
        this.name = name;
        this.add = new Address(emp_id,addLine1,addLine2,city,country);
        this.salary = sal;
        this.designation = des;
        System.out.println("New programmer account has been created");
    }

    public void setCreditForMonth(int month, int value) {
        this.perf.setMonthlyCredit(month, value);
    }

    public void displayProgrammerDetails() {
        System.out.println("Name:" + this.name);
        System.out.println("Designation:" + this.designation);
        this.add.displayAddress();
        System.out.println("Salary:" + (this.salary + this.perf.getConsolidatedCredits(mult)));
        displayEmployeeDetails();
        System.out.println("Performance Report");
        this.perf.generateReport();
        System.out.println("###############End of programmer report###############");
    }
}
