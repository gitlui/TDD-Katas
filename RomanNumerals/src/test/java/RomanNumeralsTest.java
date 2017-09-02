import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RomanNumeralsTest {
    @Test
    public void itCanBeCreated() {
        assertNotNull(new RomanNumerals());
    }

    @Test
    public void aZeroReturnsAEmptyString() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("", romanNumerals.of(0));
    }
}
