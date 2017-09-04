import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameMasterTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new GameMaster());
    }

    @Test
    public void itCanGenerateACode() {
        GameMaster gm = new GameMaster();
        assertNotNull(gm.generateCode());
    }

    @Test
    public void itCanGenerateACodeWithFourPegColours() {
        GameMaster gm = new GameMaster();
        PegColour[] code = gm.generateCode();
        assertEquals(4, code.length);
    }
}
