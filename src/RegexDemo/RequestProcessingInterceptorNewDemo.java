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
//sRequestBody={"assignee":"kermit"}; {"assignee":"[а-яА-Яa-z_A-z0-9]+$"}
public class RequestProcessingInterceptorNewDemo {

    public static void main(String[] args) {
        String myText = "{\"assignee\":\"krghjrmit\"}";
//        String myText = "{\"assignee\":\"kermit\"}"; "assignee":"[{}а-яА-Яa-z_A-z0-9]+$"
        System.out.println("myText: " + myText);
        Pattern SREQUESTBODY_PATTERN = Pattern.compile("\"assignee\":\"[а-яА-Яa-z_A-z0-9]+\"");
//        Pattern SREQUESTBODY_PATTERN = Pattern.compile("assignee:[а-яА-Яa-z_A-z0-9]+$");
        
/*
Exception in thread "main" java.util.regex.PatternSyntaxException: Illegal repetition
{"assignee":"[а-яА-Яa-z_A-z0-9]+$"}
	at java.util.regex.Pattern.error(Pattern.java:1955)
	at java.util.regex.Pattern.closure(Pattern.java:3157)
	at java.util.regex.Pattern.sequence(Pattern.java:2134)
	at java.util.regex.Pattern.expr(Pattern.java:1996)
	at java.util.regex.Pattern.compile(Pattern.java:1696)
	at java.util.regex.Pattern.<init>(Pattern.java:1351)
	at java.util.regex.Pattern.compile(Pattern.java:1028)
	at RegexDemo.RequestProcessingInterceptorNewDemo.main(RequestProcessingInterceptorNewDemo.java:21)
C:\Users\HS\AppData\Local\NetBeans\Cache\8.1\executor-snippets\run.xml:53: Java returned: 1
СБОРКА ЗАВЕРШЕНА СО СБОЕМ (общее время: 0 секунд)



         */
        System.out.println("SREQUESTBODY_PATTERN: " + SREQUESTBODY_PATTERN);
        System.out.println(SREQUESTBODY_PATTERN.matcher(myText).find());
        if (SREQUESTBODY_PATTERN.matcher(myText).find() == false) {
            System.out.println("myText не соответствует SREQUESTBODY_PATTERN");
        } else {
            System.out.println("myText соответствует SREQUESTBODY_PATTERN");
        }
    }

}
