import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GameTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new Game());
    }

    @Test
    public void itStartsWithoutACode() {
        Game game = new Game();
        assertNull(game.currentCodeToCrack());
    }
}
