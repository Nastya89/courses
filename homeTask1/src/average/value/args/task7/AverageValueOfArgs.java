package average.value.args.task7;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class AverageValueOfArgs {
    public static void main(String[] args) {
        double tempValue = 0;
        for (String str : args) {
            tempValue += Double.parseDouble(str);
        }
        System.out.println("Среднее значение вещественных чисел = " + (tempValue / args.length));
    }
}