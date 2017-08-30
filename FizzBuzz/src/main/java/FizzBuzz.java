public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String of(int input) {
        if (input > 0) {
            if (input == 15)
                return FIZZ + BUZZ;

            if (input % 3 == 0)
                return FIZZ;

            if (input % 5 == 0)
                return BUZZ;
        }

        return String.valueOf(input);
    }
}
