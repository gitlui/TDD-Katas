import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScoreTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new Score(0, 0));
    }

    @Test
    public void itGetsTheWhiteCountAtCreationAndReturnsIt() {
        assertEquals(1, new Score(1, 0).whiteCount());
    }

    @Test
    public void itGetsTheBlackCountAtCreationAndReturnsIt() {
        assertEquals(1, new Score(0, 1).blackCount());
    }
}
