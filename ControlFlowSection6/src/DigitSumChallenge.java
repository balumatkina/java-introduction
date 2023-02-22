public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -5 is " + sumDigits(-5));
        System.out.println("The sum of the digits in number 15 is " + sumDigits(15));
        System.out.println("The sum of the digits in number 0 is " + sumDigits(0));

    }

    public static int sumDigits(int numb) {
        if (numb < 0) return -1;
        int sum = 0;
        while (numb > 9) {
            sum += (numb % 10);
            numb /= 10;
        }
        sum += numb;
        return sum;
    }
}
