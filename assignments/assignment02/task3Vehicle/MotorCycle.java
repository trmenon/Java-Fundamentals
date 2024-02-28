package core.assignments.assignment02.task3Vehicle;

public class MotorCycle extends Vehicle{
    String variant;
    String make;

    public MotorCycle(
        int wheels,
        String fuel_type,
        String make,
        String var
    ) {
        super(wheels, fuel_type);
        this.variant = var;
        this.make = make;
    }

    public void getMotorCycleDetails() {
        System.out.println("##########Displaying motorcycle Details##########");
        super.getVehicleStatistics();
        System.out.println("MotorCycle Make: " + this.make);
        System.out.println("MotorCycle Variant: " + this.variant);
        System.out.println("##########End of motorcycle Details##########");
    }
    
}
