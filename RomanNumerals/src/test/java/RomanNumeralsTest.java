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
    public void itReturnsVFor5() {
        assertEquals("V", romanNumerals.of(5));
    }

    @Test
    public void itReturnsXFor10() {
        assertEquals("X", romanNumerals.of(10));
    }

    @Test
    public void itReturnsLFor50() {
        assertEquals("L", romanNumerals.of(50));
    }

    @Test
    public void itReturnsCFor100() {
        assertEquals("C", romanNumerals.of(100));
    }

    @Test
    public void itReturnsDFor500() {
        assertEquals("D", romanNumerals.of(500));
    }

    @Test
    public void itReturnsMFor1000() {
        assertEquals("M", romanNumerals.of(1000));
    }

    @Test
    public void itReturnsIVFor4() {
        assertEquals("IV", romanNumerals.of(4));
    }

    @Test
    public void itReturnsIXFor9() {
        assertEquals("IX", romanNumerals.of(9));
    }

    @Test
    public void itReturnsXLFor40() {
        assertEquals("XL", romanNumerals.of(40));
    }

    @Test
    public void itReturnsXCFor90() {
        assertEquals("XC", romanNumerals.of(90));
    }

    @Test
    public void itReturnsCDFor400() {
        assertEquals("CD", romanNumerals.of(400));
    }

    @Test
    public void itReturnsCMFor900() {
        assertEquals("CM", romanNumerals.of(900));
    }

    @Test
    public void itReturnsIIFor2() {
        assertEquals("II", romanNumerals.of(2));
    }

    @Test
    public void itReturnsIIIFor3() {
        assertEquals("III", romanNumerals.of(3));
    }

    @Test
    public void itReturnsVIFor6() {
        assertEquals("VI", romanNumerals.of(6));
    }

    @Test
    public void acceptance_itReturnsMCMLXXXVIIIFor1988() {
        assertEquals("MCMLXXXVIII", romanNumerals.of(1988));
    }

    @Test
    public void acceptance_itReturnsMCMXCIXFor1999() {
        assertEquals("MCMXCIX", romanNumerals.of(1999));
    }

    @Test
    public void acceptance_itReturnsMMVIIIFor2008() {
        assertEquals("MMVIII", romanNumerals.of(2008));
    }
}
