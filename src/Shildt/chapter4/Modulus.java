/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shildt.chapter4;

/**
 *
 * @author HS
 */
public class Modulus {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
        int a = 27;
        //a%=10;
        a=a%10;
        a+=10;
        System.out.println("x mod 3 = " + x % 3);
        System.out.println("x mod 3 = " + x / 3);
        
    }
    
}
