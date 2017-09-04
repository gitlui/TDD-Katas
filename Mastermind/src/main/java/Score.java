public class Score {
    private final int rightColourCount;
    private final int rightPositionCount;

    public Score(int rightColourCount, int rightPositionCount) {
        this.rightColourCount = rightColourCount;
        this.rightPositionCount = rightPositionCount;
    }

    public int rightColourCount() {
        return rightColourCount;
    }

    public int rightPositionCount() {
        return rightPositionCount;
    }
}
