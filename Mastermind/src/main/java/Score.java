public class Score {
    private final int whiteCount;
    private final int blackCount;

    public Score(int whiteCount, int blackCount) {
        this.whiteCount = whiteCount;
        this.blackCount = blackCount;
    }

    public int whiteCount() {
        return whiteCount;
    }

    public int blackCount() {
        return blackCount;
    }
}
