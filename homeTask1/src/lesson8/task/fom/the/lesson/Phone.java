package lesson8.task.fom.the.lesson;

import java.util.Arrays;

/**
 * Created by Anastasiya on 14-Jul-17.
 */
public class Phone {
    private int number;
    private String model;
    private double weight;
    private String name;
    private static int count = 0;

    Phone() {
        System.out.println(name);
    }

    public Phone(int number) {
        this.number = number;
        count++;
    }

    public Phone(int number1, String model1, double weight1, String name1) {
        this();
        number = number1;
        model = model1;
        weight = weight1;
        name = name1;
    }

    static int getCountNumber() {
        return count;
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String receiveCall(String name) {
        System.out.println(name);
        return name;
    }

    public int getPhoneNumber() {
        System.out.println(number);
        return number;
    }

    public String receiveCall(String name, int number) {
        System.out.println(name);
        return name;
    }

    public static void sendMesssage(int... array) {
        System.out.println(Arrays.toString(array));
    }
}

