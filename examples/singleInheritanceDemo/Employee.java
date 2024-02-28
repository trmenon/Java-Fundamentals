package core.examples.singleInheritanceDemo;

public class Employee {
   double salary;
   public Employee(double x) {
    this.salary = x;
   } 
   public void work() {
    System.out.println("Employee is working");
   }
   public void getSalary() {
    System.out.println("Salary of employee is " + this.salary);
   }
}
