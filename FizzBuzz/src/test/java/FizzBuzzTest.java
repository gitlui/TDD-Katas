import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FizzBuzzTest {

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void itCanBeCreated() {
        assertNotNull(fizzBuzz);
    }

    @Test
    public void itReturnsAZeroStringForAZero() {
        assertEquals("0", fizzBuzz.of(0));
    }

    @Test
    public void itReturnsAOneStringForAOne() {
        assertEquals("1", fizzBuzz.of(1));
    }

    @Test
    public void itReturnsAFizzForAThree() {
        assertEquals(FIZZ, fizzBuzz.of(3));
    }

    @Test
    public void itReturnsABuzzForAFive() {
        assertEquals(BUZZ, fizzBuzz.of(5));
    }

    @Test
    public void itReturnsFizzForASix() {
        assertEquals(FIZZ, fizzBuzz.of(6));
    }

    @Test
    public void itReturnsABuzzForATen() {
        assertEquals(BUZZ, fizzBuzz.of(10));
    }
}
