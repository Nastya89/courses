package lesson5.task2;


/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class Factorial {
    public static void main(String[] args) {
        int a = 1, b = 10;
        int n = a + (int) (Math.random() * b);
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        System.out.println("Result: " + result);
    }
}
