package Bike;

import Vehicle.Vehicle;

public class Bike extends Vehicle{

    private String engine;
    public Bike(String model, String maker, int numberOfWheels, int topSpeed, String engine) {
        super(model,maker,numberOfWheels,topSpeed);
        this.engine = engine;

    }
    public void accelerate() {
        System.out.println("The bike is accelerating.");
    }

    public void brake() {
        System.out.println("The bike is braking.");
    }
    
}
