import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PegColourTest {
    @Test
    public void itCanBeBlue() {
        assertNotNull(PegColour.BLUE);
    }

    @Test
    public void itCanBeGreen() {
        assertNotNull(PegColour.GREEN);
    }

    @Test
    public void itCanBeRed() {
        assertNotNull(PegColour.RED);
    }

    @Test
    public void itCanBePurple() {
        assertNotNull(PegColour.PURPLE);
    }

    @Test
    public void itCanBeYellow() {
        assertNotNull(PegColour.YELLOW);
    }

    @Test
    public void itCanReturnARandomNumberBetweenZeroAndTheColourCount() {
        boolean hadBlue = false;
        boolean hadGreen = false;
        boolean hadRed = false;
        boolean hadPurple = false;
        boolean hadYellow = false;

        for (int i = 0; i < 10000; i++) {
            PegColour colour = PegColour.getRandomColour();
            switch (colour) {
                case BLUE: hadBlue = true; break;
                case RED: hadRed = true; break;
                case GREEN: hadGreen = true; break;
                case PURPLE: hadPurple = true; break;
                case YELLOW: hadYellow = true; break;
            }
        }

        assertTrue(hadBlue);
        assertTrue(hadGreen);
        assertTrue(hadRed);
        assertTrue(hadPurple);
        assertTrue(hadYellow);

    }
}
