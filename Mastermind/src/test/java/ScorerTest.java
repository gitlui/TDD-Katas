import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScorerTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new Scorer());
    }

    @Test
    public void itReturnsAScoreForATryAndACode() {
        Scorer scorer = new Scorer();
        PegColour[] code = new PegColour[] {PegColour.BLUE, PegColour.BLUE, PegColour.BLUE, PegColour.BLUE};
        Score score = scorer.scoreTry(code, code);
        assertNotNull(score);
    }

    @Test
    public void itCanScoreOneRightColour() {
        Scorer scorer = new Scorer();
        PegColour[] code = new PegColour[]{PegColour.BLUE, PegColour.YELLOW, PegColour.YELLOW, PegColour.YELLOW};
        PegColour[] codeTry = new PegColour[]{PegColour.BLUE, PegColour.RED, PegColour.RED, PegColour.RED};
        Score score = scorer.scoreTry(codeTry, code);
        assertEquals(1, score.rightColourCount());
    }
}
