package team;

import team.player.BattingController;
import team.player.BowlingController;
import team.player.Player;

import java.util.Deque;
import java.util.Objects;
import java.util.Queue;

public class Team {
    private final String name;
    private final BattingController battingController;
    private final BowlingController bowlingController;
    private final Queue<Player> playing11;
    private int totalRuns;
    private boolean isWinner;

    public Team(String name, Queue<Player> playing11, Deque<Player> bowlers) {
        this.totalRuns = 0;
        this.name = name;
        this.playing11 = playing11;
        this.battingController = new BattingController(playing11);
        this.bowlingController = new BowlingController(bowlers);
    }

    public void chooseNextBatsman() {
        battingController.setNextBatsman();
    }

    public void chooseNextBowler(int maxOvers) {
        bowlingController.changeBowler(maxOvers);
    }

    public void rotateStrike() {
        battingController.rotateStrike();
    }

    public String getName() {
        return name;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void addRuns(int runs) {
        this.totalRuns += runs;
    }

    public BattingController getBattingController() {
        return battingController;
    }

    public BowlingController getBowlingController() {
        return bowlingController;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
