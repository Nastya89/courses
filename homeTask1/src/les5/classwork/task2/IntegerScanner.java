package les5.classwork.task2;

import java.util.Scanner;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class IntegerScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Введите число: ");
        a = sc.nextDouble();
        if (a >= 0 && a < 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
