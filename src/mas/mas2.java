/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

/**
 *
 * @author HS
 */
public class mas2 {

    public static void main(String[] args) {
        int count = 0;
        int value;
        int[] mas = {3, 3, 3};
        for (int i = 0; i < mas.length; i++) {
            value = mas[i];
            for (int j = 0; j < mas.length; j++) {
                if (mas[i]== mas[j]){ 
                    
                count++;

            }
            }
            System.out.println("count= " + count);
        }
    }

}
