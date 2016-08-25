/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegexDemo;

/**
 *
 * @author HS
 */
public class Rexep {
    private static final  String TEXT = "Мне очень нравится Тайланд. Таиланд то место куда бы я поехал. тайланд - мечты сбываются!";
    public static void main(String[] args) {
        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));
    }
    
}
