
package OOP;

public class Car {
    public String brand;
    public String model;
    public String color;
    public String typeEngine;
    public int number;
    public int age;
    public float volumeEngine;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(String brand, String model, String color, String typeEngine, int number, int age, float volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.typeEngine = typeEngine;
        this.number = number;
        this.age = age;
        this.volumeEngine = volumeEngine;
    }
    
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Lexus", "Black");
        Car car3 = new Car("Mitsubishi", "Lanser", "Yellow");
        Car car4 = new Car("Skoda", "Octavia", "Grey", "Diesel", 1987, 6, 1.8f);
    }
    
    
}
