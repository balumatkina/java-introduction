public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println("Are your double numbers equal? => " + areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumb, double secondNumb) {
        int firstInt = (int) (firstNumb * 1000), secondInt = (int) (secondNumb * 1000);
        System.out.println(firstInt);
        System.out.println(secondInt);
        if (firstInt == secondInt) {
            return true;
        }
        return false;
    }
}
