public class Game {
    private PegColour[] code;

    public Object currentCodeToCrack() {
        return code;
    }

    public int currentRound() {
        return 0;
    }

    public void startGameWithCode(PegColour[] code) {
        this.code = code;
    }
}
