public class WhileLoopChallenge {
    public static void main(String[] args) {
        int rangeStart = 5, evenCount = 0, oddCount = 0;
        while (rangeStart <= 49  && evenCount < 5) {
//            System.out.println("The number is " + rangeStart
//                    + ", is it even? => " + isEvenNumber(rangeStart));
//            rangeStart++;
            if (!isEvenNumber(rangeStart)) {
                rangeStart++;
                oddCount++;
                continue;
            }
            System.out.println("Even number found: " + rangeStart);
            rangeStart++;
            evenCount++;
        }
        System.out.println("The amount of even numbers: " + evenCount);
        System.out.println("The amount of odd numbers: " + oddCount);
    }

    public static boolean isEvenNumber(int numb) {
        if (numb < 0) return false;
        else return numb % 2 == 0;
    }
}
