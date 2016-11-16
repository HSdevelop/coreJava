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
public class foreach {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        
        for (int item : array) {
            item = random.nextInt(20);
            System.out.println(item);
            
        }
    }
    
}
