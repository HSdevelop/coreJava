package HomeWork;

/**
 *
 * @author HS
 */
public class TaskThree {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("use for:");
        for (int i = 0; i < mas.length; i++) {

            System.out.print(mas[i] + " ");

        }
        System.out.println();
        System.out.println("use while:");
        int j = 0;

        while (j < mas.length) {
            System.out.print(mas[j] + " ");
            j++;
        }
        System.out.println();
        System.out.println("use do-while:");
        int k = 0;
        do {
            System.out.print(mas[k] + " ");
            k++;

        } while (k < mas.length);
        System.out.println();
        System.out.println("use for-each:");
        int p = 0;
        for (int i : mas) {
//            System.out.print(mas[p] + " ");
//            p++; 
            System.out.print(i + " ");
        }
    }

}
//3. int[] mas = {1,2,3,4,5,6,7,8,9,10};
//3.1 Вывести все элементы массива используя операторы цикла: for, while, do while, for-each;
//3.2 Доработать задание так, чтоб элементы массива, значения которых > 5 не выводились. Не использовать оператор if/