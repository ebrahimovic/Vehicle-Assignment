package Vehicle;

public class Vehicle{

    private String model;
    private String maker;
    private int numberOfWheels;
    private int topSpeed;

    public Vehicle(){
        this.model = "model";
        this.maker = "maker";
        this.numberOfWheels = 0;
        this.topSpeed = 0;
    }

    public Vehicle(String model, String maker, int numberOfWheels, int topSpeed) {
        this.model = model;
        this.maker = maker;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }













}