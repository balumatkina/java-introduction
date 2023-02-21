public class PrimeNumbers {
    public static void main(String[] args) {
        int primeCounter = 0;
        for (int i = 5; primeCounter < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                primeCounter++;
                System.out.println("The prime number: " + i);
            }
        }
        System.out.println("The amount of prime numbers: " + primeCounter);
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) return (wholeNumber == 2);
        for (int i = 2; i < wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) return false;
        }
        return true;
    }
}
