package Bus;
import Vehicle.Vehicle;
public class Bus extends Vehicle {
    public Bus(String model, String maker, int numberOfWheels) {
        super(model, maker, numberOfWheels, 0);
    }
}
