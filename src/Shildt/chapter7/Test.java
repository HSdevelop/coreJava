/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shildt.chapter7;

/**
 *
 * @author HS
 */
public class Test {

    static int a = 1;
    static int b = 2;
    static int c = 3;

    public static void main(String[] args) {
        Test test = new Test();
        
        
        
        test.method1();
        System.out.println(a);
        test.method2();
        System.out.println(b);
        test.method3();
        System.out.println(c);

    }

    void method1() {
        System.out.print("this is method ");

    }
   

    void method2() {
        System.out.print("this is method ");

    }

    void method3() {
        System.out.print("this is method ");

    }
    
 int returna() {
     
        return a;
    }
    

    int returnb() {
        return b;
    }

    int returnc() {
        return c;
    }
}
