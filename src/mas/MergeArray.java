/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.util.Arrays;

/**
 *
 * @author HS
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] mergeArray = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, mergeArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeArray, arr1.length, arr2.length);
        System.out.println(Arrays.toString(mergeArray));
    }
}
