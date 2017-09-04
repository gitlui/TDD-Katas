public class GameMaster {
    public PegColour[] generateCode() {
        PegColour[] code = new PegColour[4];

        for (int i = 0; i < code.length; i++)
            code[i] = PegColour.getRandomColour();

        return code;
    }
}
