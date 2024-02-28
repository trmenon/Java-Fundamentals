package core.assignments.assignment02.task3Vehicle;

public class Runner {
    public static void main(String[] args) {
        Car c = new Car(4,"Petrol",2020,"Sedan", "Red");
        c.addDistance(150.0, 5.0);
        c.getCarDetails();
        Truck t = new Truck(4,"Petrol","Thomas");
        t.addDistance(3000.0, 50.0);
        t.getTruckDetails();
        MotorCycle m = new MotorCycle(4,"Petrol","Royal Enfield", "Bullet");
        m.addDistance(30000.0, 150.0);
        m.getMotorCycleDetails();
    }
}
