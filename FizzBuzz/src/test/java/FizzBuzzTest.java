import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FizzBuzzTest {

    @Test
    public void itCanBeCreated() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertNotNull(fizzBuzz);
    }
}
