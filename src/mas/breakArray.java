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
public class breakArray {
    public static void main(String[] args) {
        int[] array = {127, 96, 51, 13, 34, 22, -4, 17, 5};
        for (int item : array) {
            if (item < 0)
                break;
            System.out.println(item);
        }
    }
}
