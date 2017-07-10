package lesson6;

/**
 * Created by Anastasiya on 10-Jul-17.
 */
public class Task7 {
    public static void main(String[] args) {
        int m[][] = {
                {3, 6, 1, 9, 8, 7, 2, 12},
                {14, 3, 6, 10, 12, 11, 5, 8},
                {7, 8, 9, 4, 6, 10, 14, 17},
                {9, 12, 11, 6, 12, 13, 15, 7},
                {7, 8, 1, 3, 9, 15, 16, 14}};

        int result[][] = new int[5][2];
        for (int j = 0; j < m.length; j++) {
            int indexOfMax = 0;
            int indexOfMin = 0;

            for (int i = 0; i < m[0].length; i++) {
                if (m[j][i] > m[j][indexOfMax]) {
                    indexOfMax = i;
                } else if (m[j][i] < m[j][indexOfMin]) {
                    indexOfMin = i;
                }
            }
            result[j][0] = m[j][indexOfMax];
            result[j][1] = m[j][indexOfMin];
        }

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j][0] + " " + result[j][1]);
        }
    }
}
