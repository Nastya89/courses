package les5.classwork.task3;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class WeekDays {
    public static void main(String[] args) {
        double tempValue;
        for (String str : args) {
            tempValue = Double.parseDouble(str);
            if (tempValue == 1) {
                System.out.println("Понедельник");
            } else if ((tempValue == 2)) {
                System.out.println("Вторник");
            } else if ((tempValue == 3)) {
                System.out.println("Среда");
            } else if ((tempValue == 4)) {
                System.out.println("Четверг");
            } else if ((tempValue == 5)) {
                System.out.println("Пятница");
            } else if ((tempValue == 6)) {
                System.out.println("Выходной");
            } else if ((tempValue == 7)) {
                System.out.println("Выходной");
            } else {
                System.out.println("Неверное число");
            }
        }
    }
}


