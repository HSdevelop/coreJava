package Automobile;

/**
 *
 * @author HS
 */
public class Car {

    public String carBrand;
    public String colorCar;
    public String typeEngine;
    public String numberCar;

//    public Car() {
//        carBrand="Skoda";
//        colorCar="Grey";
//        numberCar="AA 82-12 AB";
//        typeEngine="Diesel";
//    }

    public Car(String carBrand, String colorCar, String typeEngine, String numberCar) {
        this.carBrand = "Skoda";
         this.colorCar = "Grey";
         this.typeEngine = "AA 82-12 AB";
         this.numberCar = "Diesel";
    }
    
    public static void main(String[] args) {
        Car c1 = new Car("Skoda", "Grey", "AA 82-12 AB", "TD");
        Car c2 = new Car("Skoda", "White", "AX 77-77 AB", "BSI");
    }
    
    public void log (){}

    



    
}
