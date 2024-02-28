package core.examples;

public class Car {
    // Instance Variables
    int tyre;
    // Constructor
    public Car(String carName){
        System.out.println("Name of the car is " + carName);
    }

    // Methods
    public void setTyre(int tyreNumber) {
        tyre = tyreNumber;
    }
    public int getTyre() {
        return tyre;
    }
    public static void main(String[] args) {
        Car first_car = new Car("Lancer");
        first_car.setTyre(4);
        System.out.println("Tyre specs: " + first_car.getTyre());
        System.out.println("Tyre specs: " + first_car.tyre);
    }
}
