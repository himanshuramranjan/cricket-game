package inning;

public enum RunType {
    DOT(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    SIX(6);

    private final int runs;

    RunType(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return this.runs;
    }
}
