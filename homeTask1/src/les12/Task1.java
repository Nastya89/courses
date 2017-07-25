package les12;

/**
 * Created by Anastasiya on 24-Jul-17.
 */
public class Task1 {
    public static void main(String[] args) {
        Printable[] mas = new Printable[2];
        mas[0] = new Magazine();
        mas[1] = new Book();

        for (Printable printable : mas) {
            printable.print();
        }
        printMagazines(mas);
        printBooks(mas);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Magazine)
                element.print();
        }
    }

    public static void printBooks(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Book)
                element.print();
        }
    }
}