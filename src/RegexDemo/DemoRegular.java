package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HS
 */
public class DemoRegular {

    public static void main(String[] args) {
        // Проверка на соответсвие строки шаблону
        Pattern p1 = Pattern.compile("аууу");
        Matcher m1 = p1.matcher("аууу");
        boolean b = m1.matches();

        System.out.println(b);

        // поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String s = "адреса эл.почты: mymail@tut.by и rom@bsu.by";

        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);

        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());

        }
//Разбиение строки и подстроки с применнением шаблона в качестве
//Разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        for (String word : words) {
            System.out.println(word);

        }
    }

}
