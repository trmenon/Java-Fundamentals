package core.examples.hierarchicalInheritanceDemo;

public class Vehicle {
    static int fuel_price = 100;
    int wheels;
    String fuel_type;
    float distance;
    double efficiency;

    public Vehicle(int wheels,String fuel_type){
        this.wheels = wheels;
        this.fuel_type = fuel_type;
        this.distance = 0;
        this.efficiency = 0;
    }

    public void addDistance( double d, double e) {
        double current_efficiency = d/e;
        this.distance += d;
        this.efficiency = (this.efficiency + current_efficiency)/2;
    }

    protected void getVehicleStatistics() {
        System.out.println("Number of wheels: " + this.wheels);
        System.out.println("Fuel Type: " + this.fuel_type);
        System.out.println("Total distance travelled: " + this.distance);
        System.out.println("Fuel Efficiency: " + this.efficiency);
    }
}
