public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(84656547));
    }

    public static int sumFirstAndLastDigit(int numb) {
        if (numb < 0) return -1;
        int firstDigit = numb, lastDigit = numb % 10;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
}
