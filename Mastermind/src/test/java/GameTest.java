import com.sun.org.apache.regexp.internal.RE;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;
    private final PegColour[] testCode = new PegColour[]{PegColour.BLUE, PegColour.GREEN, PegColour.PURPLE, PegColour.YELLOW};

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
    public void itAllowsForATry() {
        game.startGameWithCode(testCode);
        assertNotNull(game.tryCode(new PegColour[4]));
    }

    @Test
    public void itReturnsAScoreForOneRightColour() {
        game.startGameWithCode(testCode);
        PegColour[] codeToTry = {PegColour.GREEN, PegColour.RED, PegColour.RED, PegColour.RED};
        Score score = game.tryCode(codeToTry);
        assertEquals(1, score.rightColourCount());
    }

    @Test
    public void itIsFinishedWhenAllColoursAndPositionsAreGuesstRight() {
        game.startGameWithCode(testCode);
        game.tryCode(testCode);
        assertTrue(game.hasPlayerWonTheGame());
    }

    @Test
    public void itIsGameOverAfterTwelveFalseTries() {
        game.startGameWithCode(testCode);
        PegColour[] wrongCode = {PegColour.RED, PegColour.RED, PegColour.RED, PegColour.RED};
        for (int i = 0; i < 12; i++)
            game.tryCode(wrongCode);

        assertFalse(game.hasPlayerWonTheGame());
        assertTrue(game.hasPlayerLostTheGame());
    }

    @Test
    @Ignore
    public void fullGame() {
        game.startGameWithCode(new PegColour[]{PegColour.GREEN, PegColour.BLUE, PegColour.BLUE, PegColour.PURPLE});

        game.tryCode(new PegColour[]{PegColour.YELLOW, PegColour.RED, PegColour.PURPLE, PegColour.BLUE});
        game.tryCode(new PegColour[]{PegColour.BLUE, PegColour.BLUE, PegColour.YELLOW, PegColour.RED});
        game.tryCode(new PegColour[]{PegColour.RED, PegColour.BLUE, PegColour.YELLOW, PegColour.BLUE});
        game.tryCode(new PegColour[]{PegColour.PURPLE, PegColour.YELLOW, PegColour.YELLOW, PegColour.BLUE});
        game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.GREEN, PegColour.BLUE, PegColour.YELLOW});
        game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.GREEN, PegColour.YELLOW, PegColour.BLUE});
        game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.BLUE, PegColour.GREEN, PegColour.RED});
        game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.BLUE, PegColour.RED, PegColour.RED});
        game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.BLUE, PegColour.BLUE, PegColour.GREEN});
        game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.BLUE, PegColour.BLUE, PegColour.GREEN});

        Score score = game.tryCode(new PegColour[]{PegColour.GREEN, PegColour.BLUE, PegColour.BLUE, PegColour.PURPLE});
        assertEquals(4, score.rightColourCount());
        assertEquals(4, score.rightPositionCount());
        assertTrue(game.hasPlayerWonTheGame());
    }
}
