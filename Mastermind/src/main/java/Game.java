public class Game {
    private PegColour[] code;
    private int currentRound;
    private boolean playerHasWonTheGame;
    private int countOfTries;

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

    public Score tryCode(PegColour[] codeToTry) {
        countOfTries++;
        Score score = new Scorer().scoreTry(codeToTry, code);
        checkForWin(score);
        return score;
    }

    private void checkForWin(Score score) {
        this.playerHasWonTheGame = score.rightColourCount() == 4 && score.rightPositionCount() == 4 && this.countOfTries < 12;
    }

    public boolean hasPlayerWonTheGame() {
        return this.playerHasWonTheGame;
    }

    public boolean hasPlayerLostTheGame() {
        return !this.playerHasWonTheGame && this.countOfTries >= 12;
    }
}
