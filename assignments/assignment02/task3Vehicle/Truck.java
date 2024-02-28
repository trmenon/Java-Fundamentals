package core.assignments.assignment02.task3Vehicle;

public class Truck extends Vehicle{
    String owner;

    public Truck(
        int wheels,
        String fuel_type,
        String own
    ) {
        super(wheels, fuel_type);
        this.owner = own;
    }

    public void getTruckDetails() {
        System.out.println("##########Displaying Truck Details##########");
        super.getVehicleStatistics();
        System.out.println("Truck Owner: " + this.owner);
        System.out.println("##########End of Truck Details##########");
    }
}
