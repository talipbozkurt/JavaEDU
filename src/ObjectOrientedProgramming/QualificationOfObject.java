package ObjectOrientedProgramming; //

public class QualificationOfObject {
    public static void main(String[] args) {

        // Scenario 1: No attributes provided -> Red Audi is created.
        Car car1 = new Car();
        System.out.println(car1.brand); // Output: audi

        // Scenario 2: We specified the attributes -> Blue BMW is created.
        Car car2 = new Car("BMW", "Blue", 200);
        System.out.println(car2.brand); // Output: BMW

        // Checks if they point to the same memory location
        System.out.println(car1 == car2); // false

        // State: brand = "BMW", color = "Red", speed = 100
        System.out.println(car1.brand + car1.color + car1.speed);
        System.out.println(car2.brand + car2.color + car2.speed);
    }
}

class Car {

    // -------------------------
    // PROPERTIES = brand, color, speed
    // -------------------------
    String brand;
    String color;
    int speed;

    // Constructor

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
        this.brand = "audi";
        this.color = "red";
        this.speed = 220;
    }
}