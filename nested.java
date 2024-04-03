// Define a class called "Car"
class Car {
    // Attributes or properties of a car
    String brand;
    String model;
    int year;

    // Constructor to initialize the attributes
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Calling the displayInfo method to display information about the car
        myCar.displayInfo();
    }
}

