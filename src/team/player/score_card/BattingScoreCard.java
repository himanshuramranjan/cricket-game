package team.player.score_card;

public class BattingScoreCard {
    private int totalRuns;
    private int totalBallsPlayed;
    private int totalFours;
    private int totalSixes;
    private double strikeRate;

    public BattingScoreCard() {
        totalFours = 0;
        totalSixes = 0;
        totalRuns = 0;
        totalBallsPlayed = 0;
        setStrikeRate();
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalBallsPlayed() {
        return totalBallsPlayed;
    }

    public void setTotalBallsPlayed(int totalBallsPlayed) {
        this.totalBallsPlayed = totalBallsPlayed;
    }

    public int getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(int totalFours) {
        this.totalFours = totalFours;
    }

    public int getTotalSixes() {
        return totalSixes;
    }

    public void setTotalSixes(int totalSixes) {
        this.totalSixes = totalSixes;
    }

    public double getStrikeRate() {
        return this.strikeRate;
    }

    public void setStrikeRate() {
        this.strikeRate = (double) getTotalRuns() / (double) getTotalBallsPlayed();
    }
}
