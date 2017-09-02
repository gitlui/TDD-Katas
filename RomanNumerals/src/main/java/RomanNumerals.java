import java.util.HashMap;

public class RomanNumerals {

    private final HashMap<Integer, String> numerals;

    public RomanNumerals() {
        numerals = initializeNumerals();
    }

    private HashMap<Integer, String> initializeNumerals() {
        HashMap<Integer, String> numerals = new HashMap<Integer, String>();

        numerals.put(1000, "M");
        numerals.put(500, "D");
        numerals.put(400, "CD");
        numerals.put(100, "C");
        numerals.put(90, "XC");
        numerals.put(50, "L");
        numerals.put(40, "XL");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(1, "I");

        return numerals;
    }


    public String of(int number) {
        if (number > 0)
            return numerals.get(number);

        return "";
    }
}
