package les5.classwork.task6;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class DivisionWithoutResidue {
    public static void main(String[] args) {

        for (int a = 0; a < 100; a += 5) {
            do {
                System.out.println(a += 5);
            } while (a < 100);
        }
    }
}