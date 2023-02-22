import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxValue = 0, minValue = 0;
        int loopCount = 0;
        while (true) {
            System.out.println("Enter a number or any character to quit");
            String nextNumb = scanner.nextLine();
            try {
                double validNumb = Double.parseDouble(nextNumb);
                if (loopCount == 0 || validNumb < minValue) minValue = validNumb;
                if (loopCount == 0 || validNumb > maxValue) maxValue = validNumb;
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("min =" + minValue
                    + ", max = " + maxValue);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
