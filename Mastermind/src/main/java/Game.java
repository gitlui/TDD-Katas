public class Game {
    private PegColour[] code;
    private int currentRound;

    public Object currentCodeToCrack() {
        return code;
    }

    public int currentRound() {
        return currentRound;
    }

    public void startGameWithCode(PegColour[] code) {
        this.code = code;
        this.currentRound = 1;
    }
}
