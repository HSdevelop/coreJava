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
public class Ternary {

    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение " + i + " равно " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение " + i + " равно " + k);
    }
}
