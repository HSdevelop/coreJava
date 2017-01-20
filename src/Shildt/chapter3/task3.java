
package Shildt.chapter3;

import java.util.Arrays;

/**
 *
 * @author HS
 */
public class task3 {
    public static void main(String[] args) {
      String[] array = {"я", "учу", "обьектно", "ориентированный", "язык", "программирования"};
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length/2; i++) {
            String elementArray = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = elementArray;
        }
        System.out.println(Arrays.toString(array));
    }
    
    
            
    
}
