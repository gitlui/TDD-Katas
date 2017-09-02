import java.util.HashMap;

public class RomanNumerals {

    private final HashMap<Integer, String> numerals;

    public RomanNumerals() {
        numerals = initializeNumerals();
    }

    private HashMap<Integer, String> initializeNumerals() {
        HashMap<Integer, String> numerals = new HashMap<Integer, String>();

        numerals.put(10, "X");
        numerals.put(5, "V");
        numerals.put(1, "I");

        return numerals;
    }


    public String of(int number) {
        if (number > 0)
            return numerals.get(number);

        return "";
    }


}
