/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;


public class PodborZ {
    public static void main(String[] args) {
        int rezult = 0;
        int j = 0;
        int nums [] = {2,3,5,7,9,11,13,15};
        for (int x : nums){
            for (int y : nums){
                for (int z : nums){
                    rezult = x+y+z;
                    if (rezult==35){
                        j = j+1;
                        System.out.println("Вариант " + j);
                        System.out.println(x);
                        System.out.println(y);
                        System.out.println(z);
                    }
                }
            }
        }
    }
}
