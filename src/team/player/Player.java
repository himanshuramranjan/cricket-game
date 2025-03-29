package team.player;

import team.player.score_card.BattingScoreCard;
import team.player.score_card.BowlingScoreCard;

import java.util.List;
import java.util.Objects;

public class Player {
    private String name;
    private int age;
    private int jerseyNumber;
    private BattingScoreCard battingScoreCard;
    private BowlingScoreCard bowlingScoreCard;
    private List<PlayerType> playerTypes;

    public Player(String name, int age, int jerseyNumber, List<PlayerType> playerTypes) {
        this.name = name;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
        this.playerTypes = playerTypes;
        this.battingScoreCard = new BattingScoreCard();
        this.bowlingScoreCard = new BowlingScoreCard();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public BattingScoreCard getBattingScoreCard() {
        return battingScoreCard;
    }

    public void setBattingScoreCard(BattingScoreCard battingScoreCard) {
        this.battingScoreCard = battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard() {
        return bowlingScoreCard;
    }

    public void setBowlingScoreCard(BowlingScoreCard bowlingScoreCard) {
        this.bowlingScoreCard = bowlingScoreCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return jerseyNumber == player.jerseyNumber && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jerseyNumber);
    }
}
