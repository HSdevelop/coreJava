package Shildt.chapter3;

/**
 *
 * @author HS
 */
public class task1 {

    public static void main(String[] args) {
        long[] mas = {1000, 158, 16, 20518, 148, 1458012313, 1231534, 45654, 123131, 1245};
        long max = 0;
        int max_index = 0;
        max = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (max < mas[i]) {
                max = mas[i];
                max_index = i;

            }

        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс максимального элемента: " + max_index);

    }
}
