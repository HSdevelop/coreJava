/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegexDemo;

import java.util.regex.Pattern;

/**
 *
 * @author HS
 */
public class RequestProcessingInterceptorNewDemo { 
    public static void main(String[] args) { 
        String myText = "{\"assignee\":\"kermit\"}";
        System.out.println("myText: "+myText);
        Pattern SREQUESTBODY_PATTERN = Pattern.compile("{\"assignee\":\"[а-яА-Яa-z_A-z0-9]+$\"}");
        System.out.println("SREQUESTBODY_PATTERN: "+SREQUESTBODY_PATTERN);
        SREQUESTBODY_PATTERN.matcher(myText);
        
        System.out.println(SREQUESTBODY_PATTERN.matcher(myText).find());
        
    }
    
    
}
