public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println("In your year leap? => " + isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
