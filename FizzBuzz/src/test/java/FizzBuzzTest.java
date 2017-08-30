import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FizzBuzzTest {

    @Test
    public void itCanBeCreated() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertNotNull(fizzBuzz);
    }

    @Test
    public void itReturnsAZeroStringForAZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("0", fizzBuzz.of(0));
    }

    @Test
    public void itReturnsAOneStringForAOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.of(1));
    }
}
