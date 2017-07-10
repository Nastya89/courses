package garland.task6;

/**
 * Created by Anastasiya on 03-Jul-17.
 */
public class Garland {
    public static void main(String[] args) {
        int garlandCount = 32;
        int garlandValue = 2673;
        int switchCount = 5;
        System.out.println("Garland Switch");
        switchGarland(garlandValue, switchCount, garlandCount);
        System.out.println("Garland Row");
        garlandRow(garlandValue, garlandCount);
        System.out.println("Garland First Lamp");
        checkFirstLamp(garlandValue, garlandCount);
    }

    public static void switchGarland(int garlandValue, int switchCount, int garlandCount) {
        for (int i = 0; i < switchCount; i++) {
            int tempResult = ~garlandValue;
            getGarlandState(garlandValue, garlandCount);
            garlandValue = tempResult;
        }
    }

    public static void garlandRow(int garlandValue, int garlandCount) {
        for (int i = 0; i < garlandCount; i++) {
            int tempResult = garlandValue << 1;
            getGarlandState(garlandValue, garlandCount);
            garlandValue = tempResult;
        }
    }

    public static void checkFirstLamp(int garlandValue, int garlandCount) {
        if (garlandValue < 0) {
            System.out.println("First lamp swiched on");
        } else {
            System.out.println("First lamp swiched off");
        }
        getGarlandState(garlandValue, garlandCount);
    }

    public static void getGarlandState(int garlandValue, int garlandCount) {
        String parseResult = Integer.toBinaryString(garlandValue);
        String formattedResult = leftPad(parseResult, garlandCount, '0');
        System.out.println(formattedResult);
    }

    public static String leftPad(String originalString, int length, char padCharacter) {
        String paddedString = originalString;
        while (paddedString.length() < length) {
            paddedString = padCharacter + paddedString;
        }
        return paddedString;
    }
}