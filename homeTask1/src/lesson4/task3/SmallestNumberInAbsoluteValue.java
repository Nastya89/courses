package lesson4.task3;

import java.util.Scanner;

/**
 * Created by Anastasiya on 02-Jul-17.
 */
public class SmallestNumberInAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.print("Введите первое число: ");
        if (checkDouble(sc)) {
            a = getDouble(sc);
            System.out.print("Введите второе число: ");
            if (checkDouble(sc)) {
                b = getDouble(sc);
                System.out.print("Введите третье число: ");
                if (checkDouble(sc)) {
                    c = getDouble(sc);
                    d = Math.abs(a) < Math.abs(b)
                            ? (Math.abs(a) < Math.abs(c) ? Math.abs(a) : Math.abs(c))
                            : (Math.abs(b) < Math.abs(c) ? Math.abs(b) : Math.abs(c));
                    System.out.print("Меньшее число по модулю равно " + d);
                }
            }
        }
    }

    public static Boolean checkDouble(Scanner sc) {
        if (!sc.hasNextDouble()) {
            System.out.println("Вы ввели не число");
            return false;
        }
        return true;
    }

    private static double getDouble(Scanner sc) {
        return sc.nextDouble();
    }
}