package Truck;
import Vehicle.Vehicle;
public class Truck extends Vehicle {
    private boolean ac;
    private boolean handbrake;
    private String sound;
    private String engine;
    private boolean container;

    public Truck(String model, String maker, int numberOfWheels, int topSpeed, boolean ac, boolean handbrake, String sound, String engine, boolean container) {
        super(model, maker, numberOfWheels, topSpeed);
        this.ac = ac;
        this.handbrake = handbrake;
        this.sound = sound;
        this.engine = engine;
        this.container = container;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isHandbrake() {
        return handbrake;
    }

    public void setHandbrake(boolean handbrake) {
        this.handbrake = handbrake;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isContainer() {
        return container;
    }

    public void setContainer(boolean container) {
        this.container = container;
    }

    public void openContainer() {
        if (container) {
            System.out.println("The container is already open.");
        } else {
            container = true;
            System.out.println("Opening the container.");
        }
    }

    public void accelerate() {
        System.out.println("The truck is accelerating.");
    }

    public void brake() {
        System.out.println("The truck is braking.");
    }

    public void handbrake() {
        System.out.println("The truck handbrake is applied.");
    }
    
}

