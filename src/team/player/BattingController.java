package team.player;

import java.util.LinkedList;
import java.util.Queue;

public class BattingController {

    private final Queue<Player> battingLineUp;
    private Player striker;
    private Player nonStriker;

    public BattingController(Queue<Player> battingLineUp) {
        this.battingLineUp = new LinkedList<>(battingLineUp);
        this.striker = battingLineUp.poll();
        this.nonStriker = battingLineUp.poll();
    }

    public boolean setNextBatsman() {
        if(battingLineUp.isEmpty()) {
            System.out.println("Team is all out !!!");
            return false;
        }

        if(getStriker() == null) {
            striker = battingLineUp.poll();
        } else {
            nonStriker = battingLineUp.poll();
        }
        return true;
    }

    public Player getStriker() {
        return striker;
    }

    public void setStriker(Player striker) {
        this.striker = striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(Player nonStriker) {
        this.nonStriker = nonStriker;
    }

    public void rotateStrike() {
        Player temp = striker;
        this.striker = nonStriker;
        this.nonStriker = temp;
    }
}
