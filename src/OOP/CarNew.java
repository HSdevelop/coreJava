
package OOP;

/**
 *
 * @author HS
 */
public class CarNew extends vehicle{
    public String brand;
    public String model;
//    public String color;
    public String typeEngine;
    public int number;
    public int age;
    public float volumeEngine;
     public CarNew(int height, int width, int weight, String color, int yearOfIssue, String EngineType) {
        super(height, width, weight, color, yearOfIssue, EngineType);
    }
     public CarNew(String brand, String model, String typeEngine, int number, int age, float volumeEngine, int height, int width, int weight, String color, int yearOfIssue, String EngineType) {
        super(height, width, weight, color, yearOfIssue, EngineType);
        this.brand = brand;
        this.model = model;
        this.typeEngine = typeEngine;
        this.number = number;
        this.age = age;
        this.volumeEngine = volumeEngine;
    }
    CarNew carNew = new CarNew(2000, 1700, 2000, "White", 1987, "Diesel"); 
    }
 
