/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author HS
 */
public class ArraySeparate {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            
        }
        System.out.println(Arrays.toString(array));
        int[] arr1 = Arrays.copyOfRange(array, 0, array.length/2);
        int[] arr2 = Arrays.copyOfRange(array, array.length/2, array.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
    }
}
