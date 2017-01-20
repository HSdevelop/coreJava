/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author HS
 */
public class task45 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите число в диапазоне от -9999 до 9999");
        int adNumber = scaner.nextInt();
        if (adNumber >= -9999 && adNumber<=9999) { // проверка диапазона от -9999 до 9999
            System.out.println("Введенно число в диапазона от -9999 до 9999");
            int numberOfDigits = countDigit(adNumber); // вычисление кол-ва цифр в загаданном числе используем метод countDigit(int adNumber)
            System.out.println("Введенно число: " + adNumber);
            System.out.println("Кол-во цифр в числе: " + numberOfDigits);
            int d = stepen(numberOfDigits);
            int digit_one = adNumber % 10;
            int digit_two =  (adNumber - digit_one)%10;
            int digit_three = digit_two % 10;
            System.out.println("d: " + d);
            System.out.println("digit_one: " + digit_one);
            System.out.println("digit_two: " + digit_two);
            System.out.println("digit_three: " + digit_three);
            } else {
            System.out.println("Введенно число вне диапазона от -9999 до 9999");
            System.out.println("Повторите ввод числа: ");
            
        }
        
    }
    public static int countDigit(int adNumber){ // метод для определения кол-ва цифр в загаданном числе
        int result;
        result = (int)Math.log10(adNumber)+1;
        return result;
    } 
    public static int stepen(int numberOfDigits){ // метод для определения кол-ва цифр в загаданном числе
        int resStepen = (int)Math.pow(10, numberOfDigits-1);
        return resStepen;
    }
}
