public class Scorer {
    public Score scoreTry(PegColour[] codeTry, PegColour[] code) {
        int rightColourGuesses = 0;
        for (PegColour colourGuess : codeTry) {
            for (int j = 0; j < code.length; j++) {
                if (code[j] == colourGuess) {
                    rightColourGuesses++;
                    break;
                }
            }
        }

        return new Score(rightColourGuesses, 0);
    }
}
