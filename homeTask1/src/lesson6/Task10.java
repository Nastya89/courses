package lesson6;

import java.util.Arrays;

/**
 * Created by Anastasiya on 26-Jul-17.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 4, 3};
        System.out.println("i| " + "j| " + "Значение массива| " + "Выполнился ли блок if? ");
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                boolean temp = false;
                if (array[j - 1] > array[j]) {
                    temp = true;
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
                System.out.println(i + "| " + j + "| " + Arrays.toString(array) + "|    " + (temp ? "+" : "-"));
            }
        }
    }
}
