package Shildt.chapter6;

public class BoxDemo4 {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol1;
        double vol2;

        box1.width = 10;
        box1.heght = 15;
        box1.depth = 20;

        box2.width = 3;
        box2.heght = 6;
        box2.depth = 9;

        vol1 = box1.volume();
        System.out.println("Объем1 равен: " + vol1);
        vol2 = box1.volume();
        System.out.println("Объем2 равен: " + vol2);

    }

}
