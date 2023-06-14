package hw_2023_03_30.Game;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.getLeague() == p2.getLeague()) {
            if (p2.getScore() - p1.getScore() < 0) return -1;
            if (p2.getScore() - p1.getScore() > 0) return 1;
            return 0;
        } else {
            return p1.getLeague().compareTo(p2.getLeague());
        }
    }
}
