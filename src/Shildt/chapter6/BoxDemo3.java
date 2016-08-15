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
public class BoxDemo3 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        
        mybox1.width = 10;
        mybox1.heght = 15;
        mybox1.depth = 20;
        
        mybox2.width = 3;
        mybox2.heght = 6;
        mybox2.depth = 9;
        
        mybox1.volume();
        mybox2.volume();
        
        
        
    }

}
