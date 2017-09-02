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
    public void itReturnsAEmptyStringFor0() {
        assertEquals("", romanNumerals.of(0));
    }

    @Test
    public void itReturnsIFor1() {
        assertEquals("I", romanNumerals.of(1));
    }

    @Test
    public void itReturnsVfor5() {
        assertEquals("V", romanNumerals.of(5));
    }

    @Test
    public void itReturnsXfor10() {
        assertEquals("X", romanNumerals.of(10));
    }
}
