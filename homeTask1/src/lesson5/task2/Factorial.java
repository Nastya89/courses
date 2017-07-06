package lesson5.task2;

import java.util.Scanner;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        int result = 1;
        System.out.print("Введите число: ");
        f = sc.nextInt();
        for (int i = 1; i <= f; i++)
            result *= i;
        System.out.println("Result: " + result);
    }
}
