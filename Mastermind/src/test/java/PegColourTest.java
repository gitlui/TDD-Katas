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
}
