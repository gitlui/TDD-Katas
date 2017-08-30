public class FizzBuzz {

    public String of(int input) {
        if (input == 3)
            return "Fizz";

        if (input == 5)
            return "Buzz";

        return String.valueOf(input);
    }
}
