package les5.classwork.task4;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class WeekDaysSwitch {
    public static void main(String[] args) {
        int tempValue;
        String day;
        for (String str : args) {
            tempValue = Integer.parseInt(str);
            switch (tempValue) {
                case 1:
                    day = "Понедельник";
                    break;
                case 2:
                    day = "Вторник";
                    break;
                case 3:
                    day = "Среда";
                    break;
                case 4:
                    day = "Четверг";
                    break;
                case 5:
                    day = "Пятница";
                    break;
                case 6:
                    day = "Выходной";
                    break;
                case 7:
                    day = "Выходной";
                    break;
                default:
                    day = "Неверное число";
            }
            System.out.println(day);
        }
    }
}
