package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HS
 */


   public class RequestProcessingInterceptorDemo {

    public static void main(String[] args) {
//        String sPattern1 = "runtime/tasks/[0-9a-zA-Zа-я_А-Я]+$";
//        String s1 = "runtime/tasks/sRequestBody";
        String sPattern2 = "\"assignee\":[а-яА-Яa-z_A-z]+$\"";
//         String sRequestBody = "assignee"+":"+"Zуп_Yин";
        String s1 ="assignee";
        String s2 = ":";
        String s3 = "ZиПк_Нg";
        String s4 = "\"";
        String sRequestBody = s1 + s2 + s3;
        boolean b1 = sRequestBody.matches(sPattern2);
        System.out.println(b1);
        System.out.println("sRequestBody= " + "{"+s4+s1+s4+s2+s4+s3+s4+"}");

    }
}