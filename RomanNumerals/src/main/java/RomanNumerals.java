import java.util.HashMap;

public class RomanNumerals {

    private final HashMap<Integer, String> numerals;

    public RomanNumerals() {
        numerals = initializeNumerals();
    }

    private HashMap<Integer, String> initializeNumerals() {
        HashMap<Integer, String> numerals = new HashMap<Integer, String>();

        numerals.put(10, "X");

        return numerals;
    }


    public String of(int number) {
        if (number == 10)
            return numerals.get(number);

        if (number == 5)
            return "V";

        if (number == 1)
            return "I";

        return "";
    }


}
