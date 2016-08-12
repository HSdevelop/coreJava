
package HomeWork;

/**
 *
 * @author HS
 */
public class TaskTwo {
    public static void main(String[] args) {     
        int a = 2;
        String str = null;
        switch (a) {
            case 1:
                str = "a=1";
                break;
            case 2:
                str = "a=2";
                break;
            case 3:
                str = "a=3";
                break;
                
        }
        System.out.println(str);
    }
    
}
//2. а=1;
//а=2;
//а=3.  
//"а=1".
//В случаи а = 1 вывести "а=1";
//В слачаи а = 2 вывести "а = 2";
//в случаи а = 3 вывести "а = 3".
//При этом не использовать оператор "if" и не выводить в system.out.println(a)/