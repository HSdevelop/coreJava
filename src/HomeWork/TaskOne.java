package HomeWork;

/**
 *
 * @author HS
 */
public class TaskOne {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 3;
        if (a < b) {
            System.out.println("a<b");
            if (a < c) {
                System.out.println("a<c");
            } else {
                System.out.println("a>c");
            }
        } else {
            System.out.println("a>b");
        }
    }

}
