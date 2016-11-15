/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.util.Random;

/**
 *
 * @author HS
 */
public class SumElementArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        long sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
       }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
       }
        System.out.println("Sum = " + sum);
    }
    
}
