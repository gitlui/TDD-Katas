import org.junit.Test;

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
}
