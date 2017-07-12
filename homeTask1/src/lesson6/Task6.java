package lesson6;

/**
 * Created by Anastasiya on 10-Jul-17.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 4, 3};
        boolean br = false;
        sort(array, br);
    }

    public static void sort(int[] array, boolean br) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
                if (br == true) {
                    break;
                }
            }
            System.out.println(array[i]);
        }
    }
}
