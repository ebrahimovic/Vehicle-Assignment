import Car.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Car sedan = new Car("Sedan", "Toyota", 4, 200, true, false, "Vroom Vroom", "V8");
        sedan.printDetails();
        Car hatchback = new Car("Model Z", "Maker W", 4, 150, true, true, "Vroom", "Gasoline");
        hatchback.printDetails();

    }
}
