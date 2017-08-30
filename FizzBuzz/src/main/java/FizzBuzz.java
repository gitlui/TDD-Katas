public class FizzBuzz {

    public String of(int input) {
        if (input > 0) {
            if (input % 3 == 0)
                return "Fizz";

            if (input % 5 == 0)
                return "Buzz";
        }

        return String.valueOf(input);
    }
}
