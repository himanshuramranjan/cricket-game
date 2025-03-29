package match;

import inning.Inning;
import team.Team;

import java.time.LocalDate;

public class Match {
    private final Team teamA;
    private final Team teamB;
    private final LocalDate matchDate;
    private final Inning[] innings;
    private final MatchType matchType;

    public Match(Team teamA, Team teamB, LocalDate matchDate, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.innings = new Inning[2];
        this.matchType = matchType;
    }

    public void startMatch() {
        // assuming tossWinner always opt for batting first
        Team battingTeam = toss(teamA, teamB);
        Team bowlingTeam = battingTeam.equals(teamA) ? teamB : teamA;

        innings[0] = new Inning(battingTeam, bowlingTeam, matchType);
        innings[0].start(Integer.MAX_VALUE);

        innings[1] = new Inning(bowlingTeam, battingTeam, matchType);
        innings[1].start(battingTeam.getTotalRuns());

        System.out.println(bowlingTeam.getName() + " has won the game");
    }

    private Team toss(Team teamA, Team teamB){

        if(Math.random() < 0.5) {
            return teamA;
        } else {
            return teamB;
        }
    }

}
