package smallest.number.in.absolute.value.task5;

import java.util.Scanner;

/**
 * Created by Anastasiya on 02-Jul-17.
 */
public class SmallestNumberInAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.print("Введите три числа: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = Math.abs(a) < Math.abs(b)
                ? (Math.abs(a) < Math.abs(c) ? Math.abs(a) : Math.abs(c))
                : (Math.abs(b) < Math.abs(c) ? Math.abs(b) : Math.abs(c));
        System.out.print("Меньшее число по модулю равно " + d);
    }
}
