
package OOP;


public class Circle {
 private double x;
 private double y;
 private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

   public void show(){
       System.out.println("x= " + x + " y= " + y + " r= " + r);
   }
   
    public static void main(String[] args) {
        Circle circle = new Circle(10.0, 12.0, 15.0);
        circle.show();
        circle.setR(11);
        if(circle.getX()<circle.getY())
            circle.setX(20);
        circle.show();
    }
 
}
