package Car;
import Vehicle.Vehicle;

public class Car extends Vehicle {
    private boolean ac;
    private boolean handbrake;
    private String sound;
    private String engine;

    public Car(String model, String maker, int numberOfWheels, int topSpeed, boolean ac, boolean handbrake, String sound, String engine) {
        super(model, maker, numberOfWheels, topSpeed);
        this.ac = ac;
        this.handbrake = handbrake;
        this.sound = sound;
        this.engine = engine;
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

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("The car is braking.");
    }

    public void handbrake() {
        System.out.println("The car handbrake is applied.");
    }
    public boolean isAc() {
        return ac;
    }

    public void printDetails() {
        System.out.println("Model: " + getModel());
        System.out.println("Maker: " + getMaker());
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Top speed: " + getTopSpeed());
        System.out.println("AC: " + isAc());
        System.out.println("Handbrake: " + isHandbrake());
        System.out.println("Sound: " + getSound());
        System.out.println("Engine: " + getEngine());
    }



}
