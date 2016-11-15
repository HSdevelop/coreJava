
package mas;

import java.util.Random;

/**
 *
 * @author HS
 */
public class AverageElementArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        double Average = 0;
        long sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
       }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
       }
        Average = sum/array.length;
        System.out.println("Average = " + Average);
    }
}
