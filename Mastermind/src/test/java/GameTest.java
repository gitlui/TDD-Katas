import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void itCanBeCreated() {
        assertNotNull(game);
    }

    @Test
    public void itStartsWithoutACode() {
        assertNull(game.currentCodeToCrack());
    }

    @Test
    public void itStartsAtRoundZero() {
        assertEquals(0, game.currentRound());
    }

    @Test
    public void itTakesACodeOnce() {
        PegColour[] testCode = new PegColour[]{PegColour.BLUE, PegColour.BLUE, PegColour.BLUE, PegColour.BLUE};
        game.startGameWithCode(testCode);
        assertNotNull(game.currentCodeToCrack());
    }

    @Test
    public void itChangesToRoundOneAfterStartingTheGameWithACode() {
        GameMaster gm = new GameMaster();
        game.startGameWithCode(gm.generateCode());
        assertEquals(1, game.currentRound());
    }

    @Test
    @Ignore
    public void itAllowsForATry() {
        GameMaster gm = new GameMaster();
        game.startGameWithCode(gm.generateCode());
        assertNotNull(game.tryCode(new PegColour[4]));
    }
}
