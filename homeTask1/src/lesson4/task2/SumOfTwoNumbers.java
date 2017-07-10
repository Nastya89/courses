package lesson4.task2;

import java.util.Scanner;

/**
 * Created by Anastasiya on 02-Jul-17.
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b;
        System.out.print("Введите первое целое число: ");
        if (checkInt(sc)) {
            a = getInt(sc);
            System.out.print("Введите второе целое число: ");
        }
        if (checkInt(sc)) {
            b = getInt(sc);
            System.out.print("Сумма двух чисел равна " + (a + b));
        }
    }

    public static Boolean checkInt(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }
        return true;
    }

    private static int getInt(Scanner sc) {
        return sc.nextInt();
    }
}