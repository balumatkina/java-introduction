public class Main {
    public static void main(String[] args) {
        System.out.println("The highScore is: " + calculateScore(true, 800, 5, 100));
        System.out.println("Next highScore is: " + calculateScore(true, 10000, 8, 200));

        //CHALLENGE
        displayHighScorePosition("Tom", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(999));
        displayHighScorePosition("Percy", calculateHighScorePosition(499));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(99));
        displayHighScorePosition("Gaylord", calculateHighScorePosition(25));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into " + playerPosition + " place on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerPosition = 4;
        if (playerScore >= 1000) playerPosition = 1;
        else if (playerScore >= 500 && playerScore < 1000) playerPosition = 2;
        else if (playerScore >= 100 && playerScore < 500) playerPosition = 3;
        return playerPosition;
    }

}
