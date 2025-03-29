package team.player;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BowlingController {
    private final Deque<Player> bowlingLineup;
    private final Map<Player, Integer> bowlerVsOver;
    private Player currentBowler;

    public BowlingController(Deque<Player> bowlingLineup) {
        this.bowlingLineup = new LinkedList<>(bowlingLineup);
        this.currentBowler = bowlingLineup.pollFirst();
        this.bowlerVsOver = new HashMap<>();
        initializeBowlers();
    }

    private void initializeBowlers() {
        for(Player bowler : bowlingLineup) {
            this.bowlerVsOver.put(bowler, 0);
        }
    }

    public void changeBowler(int maxBowlingOver) {
        int currentBowlerTotalOvers = bowlerVsOver.get(currentBowler) + 1;
        if(currentBowlerTotalOvers <= maxBowlingOver) {
            bowlerVsOver.put(currentBowler, currentBowlerTotalOvers);
            bowlingLineup.addLast(currentBowler);
        }

        this.currentBowler = bowlingLineup.pollFirst();
    }

    public Deque<Player> getBowlingLineup() {
        return bowlingLineup;
    }

    public Map<Player, Integer> getBowlerVsOver() {
        return bowlerVsOver;
    }

    public Player getCurrentBowler() {
        return currentBowler;
    }
}
