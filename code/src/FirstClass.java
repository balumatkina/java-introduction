public class FirstClass {
    public static void main (String[] args) {
        double firstNum = 20.00;
        double secondNum = 80.00;
        double sumNumb = (firstNum + secondNum) * 100.00;
        System.out.println(sumNumb);
        double reminder = sumNumb % 40.00;
        System.out.println(reminder);
        boolean isReminderZero = (reminder==0.00);
//        boolean isReminderZero = reminder == 0.00 ? true : false;
        System.out.println(isReminderZero);

        if (isReminderZero)
            System.out.println("There's no reminder");
        else System.out.println("Got some reminder");
    }
}
