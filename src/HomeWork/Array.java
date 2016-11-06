/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HS
 */
public class Array {
    public static void main(String[] args) {
       List<String> subjectAccounts = new ArrayList<>();
       subjectAccounts.add("Вася");
       subjectAccounts.add("Петя");
       subjectAccounts.add("Рома");
       subjectAccounts.add("Серожа");
        for (String subjectAccount : subjectAccounts) {
          System.out.println("subjectAccount: "+subjectAccount);  
        }
        
    }
    
    
}
