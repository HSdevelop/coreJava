/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author HS
 */
public class Cat {
    private int age;
    private String name;
    private String color;

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat(20, "Murka", "White");
    }
    
}
