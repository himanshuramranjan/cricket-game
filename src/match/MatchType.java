package match;

public enum MatchType {
    ONE_DAY(50, 10),
    T_20(20, 4),
    TEST(100, 50);

    private final int totalOvers;
    private final int maxOverPerBowler;

    MatchType(int totalOvers, int maxOverPerBowler) {
        this.totalOvers = totalOvers;
        this.maxOverPerBowler = maxOverPerBowler;
    }

    public int getTotalOvers() {
        return this.totalOvers;
    }

    public int getMaxOverPerBowler() {
        return this.maxOverPerBowler;
    }
}
