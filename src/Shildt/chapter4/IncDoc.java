/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shildt.chapter4;

/**
 *
 * @author HS
 */
public class IncDoc {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 4;

        System.out.println("a++ " + a++); // -
        System.out.println("a++ " + a); // -
        a = a;
        System.out.println("a=" + a);//-
        a = a + 1;
        System.out.println("a=" + a);//-
        System.out.println("++a " + ++a); // -

        System.out.println("a == b " + (a == b));//-
        System.out.println("a != b " + (a != b));//--
        System.out.println("a == 1 && c == 3 " + ((a == 1) && (c == 3)));
        System.out.println("a == 1 && c != 3 " + ((a == 1) && (c != 3)));
        System.out.println("a == 1 & c != 3 " + ((a == 1) & (c != 3)));
        System.out.println("a != 1 || c != 3 " + ((a != 1) || (c != 3))); // -
        System.out.println("c==3 ? 3 : c " + (c == 3 ? 3 : c));
//        System.out.println("a<0 & b/0>0 " + (a<0 & b/0>0)); //-
        System.out.println("a<0 && b/0>0 " + (a < 0 && b / 0 > 0)); //-

    }

}
