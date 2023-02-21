public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int days = (int) minutes / 1440;
        int years = days / 365;
        int remainingDays = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
