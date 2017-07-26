package lesson8.task.fom.the.lesson;

/**
 * Created by Anastasiya on 14-Jul-17.
 */
public class Task {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setModel("Nokia");
        phone.setNumber(8099555);
        phone.setWeight(3.8);
        phone.setName("Vasya");

        String existedName = phone.getName();

        phone.receiveCall(existedName);
        phone.getPhoneNumber();
        phone.receiveCall(phone.getName(), phone.getNumber());
        phone.sendMesssage(1, 2);
    }
}


