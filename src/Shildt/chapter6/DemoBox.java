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
public class DemoBox {
    public static void main(String[] args) {
       Box mybox = new Box();
    double vol;
    
    mybox.width = 10;
    mybox.heght = 10;
    mybox.depth = 10;
    
    vol = mybox.depth*mybox.heght*mybox.depth;
        System.out.println("Обьем равен: "+vol);
    }
    
         
    
}
