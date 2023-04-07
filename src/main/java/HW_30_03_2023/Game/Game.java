package HW_30_03_2023.Game;

import java.util.List;
import java.util.Random;

public class Game {
    public static <T extends Player> void playGame(List<T> players) {
        int firstPoint = 0;
        int secondPoint = 1;

        while (firstPoint < players.size() - 1) {
            if (players.get(firstPoint).getLeague() == players.get(secondPoint).getLeague()) {
                twoPlayerGame(players.get(firstPoint), players.get(secondPoint));
                secondPoint++;
            } else {
                secondPoint++;
            }
            if (secondPoint == players.size() && firstPoint < players.size() - 1) {
                firstPoint++;
                secondPoint = firstPoint + 1;
            }
        }
        testResult(players);
    }

    private static void twoPlayerGame(Player player1, Player player2) {
        Random random = new Random();
        int result1 = random.nextInt(0, 2);
        int result2 = random.nextInt(0, 2);
        if (result1 == result2) {
            player1.setScore(player1.getScore() + 0.5);
            player2.setScore(player2.getScore() + 0.5);
        } else if (result1 > result2) {
            player1.setScore(player1.getScore() + 1);
        } else {
            player2.setScore(player2.getScore() + 1);
        }
    }

    private static <T extends Player> void testResult(List<T> players) {
        int firstPoint = 0;
        int secondPoint = 1;
        int count = 0;
        boolean isRun = true;
        boolean isDuplicates = false;
        while (isRun) {
            if (players.get(firstPoint).getLeague() == players.get(secondPoint).getLeague() && players.get(firstPoint).getScore() == players.get(secondPoint).getScore()) {
                twoPlayerReplay(players.get(firstPoint), players.get(secondPoint));
                secondPoint++;
                isDuplicates = true;
            } else {
                secondPoint++;
            }
            if (secondPoint == players.size() && firstPoint < players.size() - 1) {
                firstPoint++;
                secondPoint = firstPoint + 1;
            }
            if (secondPoint == players.size() && firstPoint == players.size() - 1) {
                firstPoint = 0;
                secondPoint = 1;
                if (isDuplicates) {
                    isDuplicates = false;
                } else {
                    isRun = false;
                }
            }
        }
    }

    private static void twoPlayerReplay(Player player1, Player player2) {
        Random random = new Random();
        while (player1.getScore() == player2.getScore()) {
            int result1 = random.nextInt(0, 2);
            int result2 = random.nextInt(0, 2);
            if (result1 > result2) {
                player1.setScore(player1.getScore() + 0.1);
            } else {
                player2.setScore(player2.getScore() + 0.1);
            }
        }
    }
}
