package hw_2023_03_30.Game;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;

public class Generator {
    public static void makePlayers(List<Player> players) {
        Faker faker = new Faker();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                players.add(new Player(faker.name().fullName(), random.nextInt(19, 51), League.values()[j]));
            }
        }
    }
}
