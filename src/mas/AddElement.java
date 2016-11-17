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
public class AddElement {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int length = array.length;
        int value = -5;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.print(Arrays.toString(array));
        System.out.println(" Length of an array = " + length);
    }

    public static int[] addElement(int[] array, int value) {
        int[] newArray = new int[array.length + 2];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = value;
            }
        }
        return newArray;
    } 
}
