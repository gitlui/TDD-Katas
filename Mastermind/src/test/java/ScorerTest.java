import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScorerTest {

    private Scorer scorer;

    @Before
    public void setUp() throws Exception {
        scorer = new Scorer();
    }

    @Test
    public void itCanBeCreated() {
        assertNotNull(scorer);
    }

    @Test
    public void itReturnsAScoreForATryAndACode() {
        PegColour[] code = new PegColour[]{PegColour.BLUE, PegColour.BLUE, PegColour.BLUE, PegColour.BLUE};
        Score score = scorer.scoreTry(code, code);
        assertNotNull(score);
    }

    @Test
    public void itCanScoreOneRightColour() {
        PegColour[] code = new PegColour[]{PegColour.BLUE, PegColour.YELLOW, PegColour.YELLOW, PegColour.YELLOW};
        PegColour[] codeTry = new PegColour[]{PegColour.BLUE, PegColour.RED, PegColour.RED, PegColour.RED};
        Score score = scorer.scoreTry(codeTry, code);
        assertEquals(1, score.rightColourCount());
    }

    @Test
    public void itCanScoreTwoRightColours() {
        PegColour[] code = new PegColour[] {PegColour.BLUE, PegColour.YELLOW, PegColour.RED, PegColour.RED};
        PegColour[] codeTry = new PegColour[] {PegColour.BLUE, PegColour.YELLOW, PegColour.GREEN, PegColour.GREEN};
        Score score = scorer.scoreTry(codeTry, code);
        assertEquals(2, score.rightColourCount());
    }

    @Test
    public void itCanScoreOneRightPosition() {
        PegColour[] code = new PegColour[]{PegColour.BLUE, PegColour.GREEN, PegColour.GREEN, PegColour.GREEN};
        PegColour[] codeTry = new PegColour[]{PegColour.BLUE, PegColour.RED, PegColour.RED, PegColour.RED};
        Score score = scorer.scoreTry(codeTry, code);
        assertEquals(1, score.rightColourCount());
        assertEquals(1, score.rightPositionCount());
    }

    @Test
    public void itCanScoreTwoRightPositions() {
        PegColour[] code = new PegColour[]{PegColour.BLUE, PegColour.GREEN, PegColour.YELLOW, PegColour.YELLOW};
        PegColour[] codeTry = new PegColour[]{PegColour.BLUE, PegColour.GREEN, PegColour.RED, PegColour.RED};
        Score score = scorer.scoreTry(codeTry, code);
        assertEquals(2, score.rightColourCount());
        assertEquals(2, score.rightPositionCount());
    }

    @Test
    public void itCanScoreTwoRightPositionsWithDoubleColour() {
        PegColour[] code = new PegColour[]{PegColour.BLUE, PegColour.BLUE, PegColour.YELLOW, PegColour.YELLOW};
        PegColour[] codeTry = new PegColour[]{PegColour.BLUE, PegColour.BLUE, PegColour.RED, PegColour.RED};
        Score score = scorer.scoreTry(codeTry, code);
        assertEquals(2, score.rightColourCount());
        assertEquals(2, score.rightPositionCount());
    }
}
