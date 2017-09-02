import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RomanNumerals {

    private final HashMap<Integer, String> numerals;

    public RomanNumerals() {
        numerals = initializeNumerals();
    }

    private HashMap<Integer, String> initializeNumerals() {
        HashMap<Integer, String> numerals = new HashMap<Integer, String>();

        numerals.put(1000, "M");
        numerals.put(900, "CM");
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
        String asRoman = "";

        List<Integer> numeralUnits = new ArrayList<Integer>(numerals.keySet());
        Collections.sort(numeralUnits);
        Collections.reverse(numeralUnits);

        for (int numeralUnit : numeralUnits) {
            while (number > 0 && numeralUnit <= number) {
                asRoman += numerals.get(numeralUnit);
                number -= numeralUnit;
            }
        }

        if (number < 9 && number > 4) {
            asRoman += numerals.get(5);
            number -= 5;
        }

        if (number < 4) {
            while (number > 0) {
                asRoman += numerals.get(1);
                number--;
            }
        } else if (number > 0)
            asRoman = numerals.get(number);

        return asRoman;
    }
}
