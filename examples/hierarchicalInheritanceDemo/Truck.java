package core.examples.hierarchicalInheritanceDemo;

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
        super.getVehicleStatistics();
        System.out.println("Truck Owner: " + this.owner);
    }
}
