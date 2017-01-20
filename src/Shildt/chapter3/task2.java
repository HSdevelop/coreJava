/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shildt.chapter3;

import java.util.Arrays;

/**
 *
 * @author HS
 */
public class task2 {
    public static void main(String[] args) {
        String[] mas = {"я", "учу", "обьектно", "ориентированный", "язык", "программирования"};
        System.out.println(Arrays.toString(mas));
        
        for (int i = 0; i < mas.length/2; i++) {
            String ma = mas[i];
            mas[i] = mas[mas.length - 1 -i];
            mas[mas.length - 1 -i] = ma;
            
        }
        System.out.println(Arrays.toString(mas));
    }
}
