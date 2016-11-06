/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Place;

/**
 *
 * @author HS
 */
public class Alphabet {
    public static void main(String[] args) {
        char lt = 'A';
        char cc = 'А';
        
        while (lt <= 'Z' && cc <= 'Я') {            
            System.out.println(lt + " " + cc);
            lt++;
            cc++;
        }
    }
    
}
