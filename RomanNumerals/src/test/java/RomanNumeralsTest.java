import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void aOneReturnsI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.of(1));
    }
}
