import org.junit.Test;

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
}
