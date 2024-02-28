package core.assignments.assignment02.task2Employee;

public class Employee {
    int emp_id;
    String project_id;
    Performance perf;
    
    public Employee(String projectId, int emp_id) {
        this.project_id = projectId;
        this.emp_id = emp_id;
        this.perf = new Performance(emp_id);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID:"+this.emp_id);
        System.out.println("Project Id:"+ this.project_id);
    }
}
