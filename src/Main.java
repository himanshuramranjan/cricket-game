import match.Match;
import match.MatchType;
import team.Team;
import team.player.Player;
import team.player.PlayerType;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Team teamA = addTeam("India");
        Team teamB = addTeam("Sri Lanka");

        MatchType matchType = MatchType.T_20;
        Match match = new Match(teamA, teamB, LocalDate.now(), matchType);
        match.startMatch();

    }

    private static Team addTeam(String name) {

        Queue<Player> playerDetails = new LinkedList<>();

        Player p1 = new Player(name+"1", 25, 1, List.of(PlayerType.ALLROUNDER, PlayerType.CAPTAIN));
        Player p2 = new Player(name+"2", 25, 2, List.of(PlayerType.BATSMAN));
        Player p3 = new Player(name+"3", 25, 3,List.of(PlayerType.BATSMAN));
        Player p4 = new Player(name+"4", 25, 4,List.of(PlayerType.BATSMAN));
        Player p5 = new Player(name+"5", 25, 5,List.of(PlayerType.BATSMAN));
        Player p6 = new Player(name+"6", 25, 6,List.of(PlayerType.BATSMAN));
        Player p7 = new Player(name+"7", 25, 7,List.of(PlayerType.BATSMAN));
        Player p8 = new Player(name+"8", 25, 8,List.of(PlayerType.ALLROUNDER));
        Player p9 = new Player(name+"9", 25, 9,List.of(PlayerType.BOWLER));
        Player p10 = new Player(name+"10", 25, 10,List.of(PlayerType.BOWLER));
        Player p11 = new Player(name+"11", 25, 11,List.of(PlayerType.BOWLER));

        playerDetails.add(p1);
        playerDetails.add(p2);
        playerDetails.add(p3);
        playerDetails.add(p4);
        playerDetails.add(p5);
        playerDetails.add(p6);
        playerDetails.add(p7);
        playerDetails.add(p8);
        playerDetails.add(p9);
        playerDetails.add(p10);
        playerDetails.add(p11);

        Deque<Player> bowlers = new LinkedList<>();
        bowlers.add(p8);
        bowlers.add(p9);
        bowlers.add(p10);
        bowlers.add(p11);

        return new Team(name, playerDetails, bowlers);

    }

}