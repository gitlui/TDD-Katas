import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScoreTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new Score(0, 0));
    }

    @Test
    public void itGetsRightColourCountAtCreationAndReturnsIt() {
        assertEquals(1, new Score(1, 0).rightColourCount());
    }

    @Test
    public void itGetsTheRightPositionCountAtCreationAndReturnsIt() {
        assertEquals(1, new Score(0, 1).rightPositionCount());
    }
}
