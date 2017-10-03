public enum PegColour {
    GREEN, RED, PURPLE, YELLOW, BLUE;

    public static PegColour getRandomColour() {
        int colourIndex = (int) Math.floor(Math.random() * PegColour.values().length);
        return PegColour.values()[colourIndex];
    }
}
