package les5.classwork.task1;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class OddNumber {
    public static void main(String[] args) {
        double tempValue;
        for (String str : args) {
            tempValue = Double.parseDouble(str);
            if (tempValue % 2 == 1) {
                System.out.println("Вы ввели число " + tempValue + "." + " Это нечетное число");
            } else {
                System.out.println(" Это четное число");
            }
        }
    }
}