package lesson5;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Toyota", "Camry");
        System.out.println(Car.numberOfCars);
    }
}

class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
