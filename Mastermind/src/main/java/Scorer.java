public class Scorer {
    public Score scoreTry(PegColour[] codeTry, PegColour[] code) {
        int rightColourGuesses = 0;
        int rightPositionCount = 0;

        for (int positionOfColourToTry = 0; positionOfColourToTry < codeTry.length; positionOfColourToTry++) {

            PegColour colourGuess = codeTry[positionOfColourToTry];

            for (int positionOfColourInCode = 0; positionOfColourInCode < code.length; positionOfColourInCode++) {
                PegColour aCodePart = code[positionOfColourInCode];
                if (aCodePart == colourGuess) {
                    rightColourGuesses++;

                    if (positionOfColourToTry == positionOfColourInCode)
                        rightPositionCount++;

                    break;
                }
            }
        }

        return new Score(rightColourGuesses, rightPositionCount);
    }
}
