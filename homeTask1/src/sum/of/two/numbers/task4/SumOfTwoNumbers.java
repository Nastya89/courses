package sum.of.two.numbers.task4;

import java.util.Scanner;

/**
 * Created by Anastasiya on 02-Jul-17.
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Введите первое целое число: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                System.out.print("Сумма двух чисел равна " + (a + b));
            } else {
                System.out.println("Вы ввели не целое число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}