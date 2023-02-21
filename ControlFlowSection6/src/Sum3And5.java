public class Sum3And5 {
    public static void main(String[] args) {
        int metConditionsCounter = 0;
        int metConditionsSum = 0;
        for (int i = 1; metConditionsCounter < 5 && i <= 1000; i++) {
            if ((i%3 == 0) && (i%5==0)) {
                System.out.println("The number " + i + " met the conditions!");
                metConditionsSum += i;
                metConditionsCounter++;
            }
        } System.out.println("The total is " + metConditionsSum);
    }
}
