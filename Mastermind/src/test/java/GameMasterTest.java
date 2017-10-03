import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameMasterTest {

    private GameMaster gm;

    @Before
    public void setUp() throws Exception {
        gm = new GameMaster();
    }

    @Test
    public void itCanBeCreated() {
        assertNotNull(gm);
    }

    @Test
    public void itCanGenerateACode() {
        assertNotNull(gm.generateCode());
    }

    @Test
    public void itCanGenerateACodeWithFourPegColours() {
        PegColour[] code = gm.generateCode();
        assertEquals(4, code.length);
    }

    @Test
    public void itCanGenerateACodeWhichActuallyContainsPegColours() {
        PegColour[] code = gm.generateCode();

        for (int i = 0; i < code.length; i++)
            assertEquals(PegColour.class, code[i].getClass());
    }
}
