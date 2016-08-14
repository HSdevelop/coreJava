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
public class NewBox {
    
    double width;
    double heigth;
    double depth;
    
    double volume(){
        return width*heigth*depth;
    }
    void setDim(double w,double h,double d){
        width = w;
        heigth = h;
        depth = d;
    }
    
    
}
