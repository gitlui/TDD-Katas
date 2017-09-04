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
        assertEquals(PegColour.class, code[0].getClass());
        assertEquals(PegColour.class, code[1].getClass());
        assertEquals(PegColour.class, code[2].getClass());
        assertEquals(PegColour.class, code[3].getClass());
    }
}
