package session2;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine;  // Composition

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);  // Created inside
    }

    public void showCarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.getType());
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "V8");

        car1.showCarDetails();
    }
}