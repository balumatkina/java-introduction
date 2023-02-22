public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int numbFirst, int numbSecond, int numbThird) {
        if (isValid(numbFirst) && isValid(numbSecond) && isValid(numbThird)) {
            int lastDigitFirst = numbFirst % 10, lastDigitSecond = numbSecond % 10,
                    lastDigitThird = numbThird % 10;
            return ((lastDigitFirst == lastDigitSecond) || (lastDigitFirst == lastDigitThird) || (lastDigitSecond == lastDigitThird));
        }
        return false;
    }

    public static boolean isValid(int numb) {
        return numb >= 10 && numb <= 1000;
    }
}
