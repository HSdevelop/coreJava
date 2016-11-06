/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automobile; 

/**
 *
 * @author HS
 */
public class Car {
    
    String carBrand;
    String colorCar;
    String typeEngine;
    int numberCar;

    public Car(String carBrand, String colorCar, String typeEngine, int numberCar) {
        carBrand = "Skoda";
        colorCar = "Grey";
        typeEngine = "Diesel";
        numberCar = 7777;
       }
    void log(){
        System.out.println("carBrand: "+ carBrand);
        System.out.println("colorCar: "+ colorCar);
        System.out.println("typeEngine: "+ typeEngine);
        System.out.println("numberCar: "+ numberCar);
    }
}
    
    
    

