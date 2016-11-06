/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author HS
 */
public class StringToUrl {
    public static void main(String[] args) throws MalformedURLException {
        String ur = "https://igov.org.ua/search?sID_Order=218275015";
        URL myURL = new URL(ur);
        System.out.println("Ссылка "+myURL);
    }
    
}
