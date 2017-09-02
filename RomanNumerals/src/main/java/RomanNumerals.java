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
        fillNumeralUnitsInto(numerals);
        return numerals;
    }

    private void fillNumeralUnitsInto(HashMap<Integer, String> numerals) {
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
    }

    private List<Integer> orderedNumeralUnitsFromBiggestToLowest() {
        List<Integer> numeralUnits = new ArrayList<Integer>(numerals.keySet());
        Collections.sort(numeralUnits);
        Collections.reverse(numeralUnits);
        return numeralUnits;
    }

    public String of(int number) {
        String asRoman = "";

        List<Integer> numeralUnits = orderedNumeralUnitsFromBiggestToLowest();
        for (int numeralUnit : numeralUnits) {
            while (number > 0 && numeralUnit <= number) {
                asRoman += numerals.get(numeralUnit);
                number -= numeralUnit;
            }
        }

        return asRoman;
    }

}
