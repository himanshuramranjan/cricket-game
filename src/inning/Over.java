package inning;

import team.Team;

import java.util.ArrayList;
import java.util.List;

public class Over {
    private int overNumber;
    private List<Delivery> deliveries;
    private int extraBalls;

    public Over(int overNumber) {
        this.overNumber = overNumber;
        this.extraBalls = 0;
        this.deliveries = new ArrayList<>();
    }

    public boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) {
        int ball = 1;

        while(ball <= 6) {
            Delivery delivery = new Delivery(1);
            delivery.performDelivery(battingTeam, bowlingTeam);

            BallType ballType = delivery.getBallType();
            RunType runType = delivery.getRunType();

            if(ballType.equals(BallType.NORMAL)) {
                battingTeam.addRuns(runType.getRuns());
                ball++;
            } else if(ballType.equals(BallType.WIDE_BALL)) {
                if(runType.equals(RunType.SIX)) battingTeam.addRuns(1);
                else {
                    battingTeam.addRuns(runType.getRuns() + 1);
                }
            } else if(ballType.equals(BallType.OUT)) {
                runType = RunType.DOT;
                battingTeam.getBattingController().setStriker(null);
                if(!battingTeam.getBattingController().setNextBatsman()) return false;
            } else {
                // implement the logic for no ball
            }
            deliveries.add(delivery);

            if(runType.getRuns() % 2 != 0) {
                battingTeam.getBattingController().rotateStrike();
            }
        }
        return battingTeam.getTotalRuns() >= runsToWin;
    }

    public int getOverNumber() {
        return overNumber;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public int getExtraBalls() {
        return extraBalls;
    }
}
