package lesson6;

/**
 * Created by Anastasiya on 12-Jul-17.
 */
public class Task9 {
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 4, 3, 9};
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    x = array[j];
                }
            }

            if (array[k] != array[i]) ;
            {
                array[k] = array[i];
                array[i] = x;
            }
            System.out.println(array[i]);
        }
    }
}
