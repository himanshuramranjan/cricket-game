package inning;

import team.Team;
import team.player.Player;

public class Delivery {
    private int ballNumber;
    private BallType ballType;
    private RunType runType;
    private Player playedBy;
    private Player bowledBy;

    public Delivery(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void performDelivery(Team battingTeam, Team bowlingTeam) {
        playedBy = battingTeam.getBattingController().getStriker();
        bowledBy = bowlingTeam.getBowlingController().getCurrentBowler();

        ballType = getBallType();
        runType = getRunType();

        // update observers
    }

    public BallType getBallType() {

        // can implement logic to select ball type
        return BallType.NORMAL;
    }

    public RunType getRunType() {
        double val = Math.random();
        if(val < 0.1)
            return RunType.DOT;
        else if (val <= 0.2) {
            return RunType.ONE;
        } else if (val <= 0.4) {
            return RunType.TWO;
        } else if (val <= 0.6) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }
}
