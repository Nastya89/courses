package lesson6;

import java.util.Arrays;

/**
 * Created by Anastasiya on 26-Jul-17.
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 4, 3, 9};
        System.out.println("i| " + "j| " + "Значение массива|  " + "Выполнился ли блок if? ");
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            boolean temp = false;
            int tempJ = 0;
            for (int j = i + 1; j < array.length; j++) {
                tempJ = j;
                if (array[j] < x) {
                    temp = true;
                    k = j;
                    x = array[j];
                }
            }
            array[k] = array[i];
            array[i] = x;
            System.out.println(i + "| " + tempJ + "| " + Arrays.toString(array) + "|    " + (temp ? "+" : "-"));
        }
    }
}