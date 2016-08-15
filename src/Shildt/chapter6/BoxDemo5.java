/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shildt.chapter6;

/**
 *
 * @author LDI
 */
public class BoxDemo5 {

    public static void main(String[] args) {
        NewBox myboxOne = new NewBox();
        NewBox myboxTwo = new NewBox();
        double vol;

        myboxOne.setDim(10, 20, 15);
        myboxTwo.setDim(3, 6, 9);
        
        vol = myboxOne.volume();
        System.out.println("Volume: "+vol);
        vol = myboxTwo.volume();
        System.out.println("Volume: "+vol);
        

    }
}
