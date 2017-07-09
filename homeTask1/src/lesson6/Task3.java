package lesson6;

/**
 * Created by Anastasiya on 07-Jul-17.
 */
public class Task3 {
    public static void main(String[] args) {
        String[][] mas = new String[3][6];
        int a, b;
        char k = 'a';
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 6; b++) {
                mas[a][b] = k + (b + 1 + " ");
            }
            k++;
        }
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 6; b++) {
                System.out.print(mas[a][b] + " ");
            }
            System.out.println();
        }
    }
}