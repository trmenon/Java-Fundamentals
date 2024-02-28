package core.assignments.assignment02.task3Vehicle;

public class Car extends Vehicle{
    int model;
    String variant;
    String color;

    public Car(
        int wheels,
        String fuel_type,
        int model,
        String var,
        String col
    ) {
        super(wheels, fuel_type);
        this.color = col;
        this.variant = var;
        this.model = model;
    }

    public void getCarDetails() {
        System.out.println("##########Displaying Car Details##########");
        super.getVehicleStatistics();
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Variant: " + this.variant);
        System.out.println("Car Color: " + this.color);
        System.out.println("##########End of Car Details##########");
    }
}
