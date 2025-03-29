package team.player.score_card;

public class BowlingScoreCard {
    private int totalOvers;
    private int runsGiven;
    private int wicketsTaken;
    private int noBalls;
    private int wideBalls;
    private double economy;

    public BowlingScoreCard() {
        totalOvers = 0;
        runsGiven = 0;
        wicketsTaken = 0;
        noBalls = 0;
        wideBalls = 0;
        economy = 0.0;
    }

    public int getTotalOvers() {
        return totalOvers;
    }

    public void setTotalOvers(int totalOvers) {
        this.totalOvers = totalOvers;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public int getNoBalls() {
        return noBalls;
    }

    public void setNoBalls(int noBalls) {
        this.noBalls = noBalls;
    }

    public int getWideBalls() {
        return wideBalls;
    }

    public void setWideBalls(int wideBalls) {
        this.wideBalls = wideBalls;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy() {
        this.economy = (double) getRunsGiven() / (double) getTotalOvers();
    }
}
