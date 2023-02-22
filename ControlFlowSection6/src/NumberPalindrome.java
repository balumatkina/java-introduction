public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-34543));
    }

    public static boolean isPalindrome(int number) {
        int temp, remain, sum = 0;
        if (number < 0) {
            number *= (-1);
        }
        temp = number;
        while (number > 0) {
            remain = number % 10;
            sum = (sum * 10) + remain;
            number /= 10;
        }
        return temp == sum;
    }
}
