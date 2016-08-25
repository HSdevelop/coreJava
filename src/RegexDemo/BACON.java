
package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HS
 */
public class BACON {
            public static boolean test(String testString){  
        Pattern p = Pattern.compile("^BACON$");  
        Matcher m = p.matcher(testString);  
        return m.matches(); 
                
        } 
            
    }
 
