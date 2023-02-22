public class EvenDigitSum {
    public static void main(String[] args) {
System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int numb) {
        int sum = 0, temp;
        if (numb < 0) return  -1;
        while (numb > 0){
            temp = numb % 10;
            if (temp % 2 == 0) sum += temp;
            numb /= 10;
        }
        return sum;
    }
}
