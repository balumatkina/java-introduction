public class Main {
    public static void main(String[] args) {
        System.out.println("The highScore is: " + calculateScore(true, 800, 5, 100));
        System.out.println("Next highScore is: " + calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
        }
        return finalScore;
    }
}
