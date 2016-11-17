
package OOP;

public class Wasp extends Insect{
    
    public Wasp(int size, String color) {
        super(size, color);
    }
    public void move(){
        super.move();
        System.out.println("Wasp fly");
    }
    public void attack(){
        super.attack();
        System.out.println("Wasp attack");
    }
    
}


