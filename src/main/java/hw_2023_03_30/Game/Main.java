package hw_2023_03_30.Game;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Generator.makePlayers(players);
        Game.playGame(players);
        PlayerComparator pc = new PlayerComparator();
        players.sort(pc);
        printChamp(players);
        System.out.println(players);
    }

    public static <T extends Player> void printChamp(List<T> players) {
        System.out.println("********************************\nChampion of every league\n");
        for (int i = 0; i < players.size(); i += 5) {
            System.out.print(players.get(i));
        }
        System.out.println("*********************************\n");
    }
}
