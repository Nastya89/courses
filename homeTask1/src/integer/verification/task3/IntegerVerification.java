package integer.verification.task3;

import java.util.Scanner;

/**
 * Created by Anastasiya on 02-Jul-17.
 */
public class IntegerVerification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i % 2 == 0) {
                System.out.println("Вы ввели число " + i + "." + " Это четное число");
            } else {
                System.out.println("Вы ввели число " + i + "." + " Это нечетное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
