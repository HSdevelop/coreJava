package OOP;

/**
 *
 * @author HS
 */
public class Rectangle {

    int x, y, w, h;

    public Rectangle() {
        this(1, 1, 4, 8);
    }

    public Rectangle(int x, int y, int width, int heigth) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = heigth;

    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    }
}
