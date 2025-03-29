package Inning;

import match.MatchType;
import team.Team;

import java.util.ArrayList;
import java.util.List;

public class Inning {
    private Team battingTeam;
    private Team bowlingTeam;
    private MatchType matchType;
    private List<Over> overs;

    public Inning(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        this.overs = new ArrayList<>();
    }

    public void start(int runsToWin) {

        int noOfOvers = matchType.getTotalOvers();
        int maxOvers = matchType.getMaxOverPerBowler();

        for(int i = 1; i <= noOfOvers; i++) {
            Over over = new Over(i);
            boolean hasWonOrComplete = over.startOver(battingTeam, bowlingTeam, runsToWin);
            overs.add(over);

            if(hasWonOrComplete && battingTeam.getTotalRuns() >= runsToWin) {
                System.out.println(battingTeam.getName() + " has won the game");
                return;
            } else if(hasWonOrComplete) {
                System.out.println(battingTeam.getName() + " is all out");
                return;
            }
            bowlingTeam.chooseNextBowler(maxOvers);
        }
    }
}
