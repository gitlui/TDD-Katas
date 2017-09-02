import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void itCanBeCreated() {
        assertNotNull(romanNumerals);
    }

    @Test
    public void aZeroReturnsAEmptyString() {
        assertEquals("", romanNumerals.of(0));
    }

    @Test
    public void aOneReturnsI() {
        assertEquals("I", romanNumerals.of(1));
    }

}
