package HW_30_03_2023.Game;

public class Player {
    private String name;
    private int age;
    private League league;
    private double score;

    public Player(String name, int age, League league) {
        this.name = name;
        this.age = age;
        this.league = league;
    }

    public League getLeague() {
        return league;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", league=" + league +
                ", score=" + score +
                '}' + '\n';
    }
}
