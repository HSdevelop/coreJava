package Shildt.chapter6;

/**
 *
 * @author LDI
 */
public class BoxDemo2 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // Присваивание значений переменным mybox1
        mybox1.width = 10;
        mybox1.heigth = 20;
        mybox1.depth = 15;

        // Присваивание значений переменным mybox2
        mybox2.width = 9;
        mybox2.heigth = 6;
        mybox2.depth = 3;

        // Вычисление обьема первого параллелепипеда
        vol = mybox1.depth * mybox1.heigth * mybox1.width;
        System.out.println("Обьем1 равен: " + vol);

        vol = mybox2.depth * mybox2.heigth * mybox2.width;
        System.out.println("Обьем2 равен: " + vol);
    }

}
