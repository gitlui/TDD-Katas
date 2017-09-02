import java.util.HashMap;

public class RomanNumerals {

    private final HashMap<Integer, String> numerals;

    public RomanNumerals() {
        numerals = initializeNumerals();
    }

    private HashMap<Integer, String> initializeNumerals() {
        HashMap<Integer, String> numerals = new HashMap<Integer, String>();
        return numerals;
    }


    public String of(int number) {
        if (number == 10)
            return "X";

        if (number == 5)
            return "V";

        if (number == 1)
            return "I";

        return "";
    }


}
