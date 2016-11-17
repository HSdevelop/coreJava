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
public class Building {
    public int floors;
    public int occupants;
    public static void main(String[] args) {
        Building b = new Building();
        b.floors = 5;
        b.occupants = 15;
        System.out.println("Building have " + b.floors + " floors " + b.occupants + " occupants");
    }
    
}
