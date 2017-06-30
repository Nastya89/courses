package TypeConvertingTask1;

/**
 * Created by Anastasiya on 28-Jun-17.
 */
public class TypeConverting {
    public static void main(String[] args) {
        byteConverting();
        shortConverting();
        charConverting();
        intConverting();
        longConverting();
        floatConverting();
        doubleConverting();
    }

    public static void byteConverting() {
        byte a = 8;
        System.out.println("Byte converting, value: " + a);

        short b = a;
        System.out.println("Byte to short = " + b);

        int c = a;
        System.out.println("Byte to int = " + c);

        long d = a;
        System.out.println("Byte to long = " + d);

        float e = a;
        System.out.println("Byte to float = " + e);

        double f = a;
        System.out.println("Byte to double = " + f);

        char h = (char) a;
        System.out.println("Byte to char = " + h);
    }

    public static void shortConverting() {
        short a = 32;
        System.out.println("Short converting, value: " + a);

        byte b = (byte) a;
        System.out.println("Short to byte = " + b);

        int c = a;
        System.out.println("Short to int = " + c);

        long d = a;
        System.out.println("Short to long = " + d);

        float e = a;
        System.out.println("Short to float = " + e);

        double f = a;
        System.out.println("Short to double = " + f);

        char h = (char) a;
        System.out.println("Short to char = " + h);
    }

    public static void charConverting() {
        char a = 'z';
        System.out.println("Char converting, value: " + a);

        byte b = (byte) a;
        System.out.println("Char to byte = " + b);

        int c = a;
        System.out.println("Char to int = " + c);

        long d = a;
        System.out.println("Char to long = " + d);

        float e = a;
        System.out.println("Char to float = " + e);

        double f = a;
        System.out.println("Char to double = " + f);

        short h = (short) a;
        System.out.println("Char to short = " + h);
    }

    public static void intConverting() {
        int a = 101;
        System.out.println("Int converting, value: " + a);

        byte b = (byte) a;
        System.out.println("Int to byte = " + b);

        short c = (short) a;
        System.out.println("Int to short = " + c);

        long d = a;
        System.out.println("Int to long = " + d);

        float e = a;
        System.out.println("Int to float = " + e);

        double f = a;
        System.out.println("Int to double = " + f);

        char h = (char) a;
        System.out.println("Int to char = " + h);
    }

    public static void longConverting() {
        long a = 1021;
        System.out.println("Long converting, value: " + a);

        byte b = (byte) a;
        System.out.println("Long to byte = " + b);

        short c = (short) a;
        System.out.println("Long to short = " + c);

        int d = (int) a;
        System.out.println("Long to long = " + d);

        float e = a;
        System.out.println("Long to float = " + e);

        double f = a;
        System.out.println("Long to double = " + f);

        char h = (char) a;
        System.out.println("Long to char = " + h);
    }

    public static void floatConverting() {
        float a = 3.5f;
        System.out.println("Float converting, value: " + a);

        byte b = (byte) a;
        System.out.println("Float to byte = " + b);

        short c = (short) a;
        System.out.println("Float to short = " + c);

        int d = (int) a;
        System.out.println("Float to long = " + d);

        long e = (long) a;
        System.out.println("Float to long = " + e);

        double f = a;
        System.out.println("Float to double = " + f);

        char h = (char) a;
        System.out.println("Float to char = " + h);
    }

    public static void doubleConverting() {
        double a = 96.5;
        System.out.println("Double converting, value: " + a);

        byte b = (byte) a;
        System.out.println("Double to byte = " + b);

        short c = (short) a;
        System.out.println("Double to short = " + c);

        int d = (int) a;
        System.out.println("Double to long = " + d);

        long e = (long) a;
        System.out.println("Double to long = " + e);

        float f = (float) a;
        System.out.println("Double to float = " + f);

        char h = (char) a;
        System.out.println("Double to char = " + h);
    }
}
