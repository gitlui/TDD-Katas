import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScoreTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new Score(0));
    }

    @Test
    public void itGetsTheWhiteCountAtCreationAndReturnsIt() {
        assertEquals(1, new Score(1).whiteCount());
    }
}
