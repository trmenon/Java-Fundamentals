package core.examples.singleInheritanceDemo;

public class HRManager extends Employee {
    public HRManager(double x) {
        super(x);
    }
    public void work() {
        super.work();
        System.out.println("HR Manager takes care of Human Resources related functions of organization");
    }
}
