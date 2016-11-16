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
public class MinElementArray {

    public static void main(String[] args) {
        int min;
        int max;
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }
        min = array[0];
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                
            }
            if (max < array[i]) {
                max = array[i];
                
            }
            
            
        }
        System.out.println("Min= " + min + "; Max= " + max);
    }

}
