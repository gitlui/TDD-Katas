import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ScoreTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new Score());
    }

    @Test
    public void itHasAWhiteCount() {
        assertNotNull(new Score().whiteCount());
    }
}
