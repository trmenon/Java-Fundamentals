package core.examples.hierarchicalInheritanceDemo;

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
        super.getVehicleStatistics();
        System.out.println("MotorCycle Make: " + this.make);
        System.out.println("MotorCycle Variant: " + this.variant);
    }
    
}
