public class SharedDigit {
    public static void main(String[] args) {
System.out.println(hasSharedDigit(12,43));
    }

    public static boolean hasSharedDigit(int numbFirst, int numbSecond) {
        if ((numbFirst >= 10) && (numbFirst <= 99) & (numbSecond >= 10) && (numbSecond <= 99)) {
            int firstNumbFirstDig = numbFirst, firstNumbLastDig = numbFirst % 10,
                    secondNumbFirstDig = numbSecond, secondNumbLastDig = numbSecond % 10;
            while (firstNumbFirstDig > 10) {
                firstNumbFirstDig /= 10;
            }
            while (secondNumbFirstDig > 10) {
                secondNumbFirstDig /= 10;
            }
            return ((firstNumbFirstDig==secondNumbFirstDig)||(firstNumbFirstDig==secondNumbLastDig)||(firstNumbLastDig==secondNumbFirstDig)||(firstNumbLastDig==secondNumbLastDig));
        }
        return false;
    }
}
