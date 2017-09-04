public class Score {
    private final int whiteCount;

    public Score(int whiteCount, int blackCount) {
        this.whiteCount = whiteCount;
    }

    public int whiteCount() {
        return whiteCount;
    }

    public int blackCount() {
        return 0;
    }
}
