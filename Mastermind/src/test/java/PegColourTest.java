import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
}
