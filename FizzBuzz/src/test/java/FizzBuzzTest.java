import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FizzBuzzTest {

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
        assertEquals("Fizz", fizzBuzz.of(3));
    }
}
