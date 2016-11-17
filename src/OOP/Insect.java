
package OOP;

public class Insect {
    private int size;
    String color;

    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }
    
    public void move(){
        System.out.println("Insect move -> ");
    }
    public void attack(){
        System.out.println("attack -> ");
    }
    
}


