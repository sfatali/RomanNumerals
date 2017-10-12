import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Sabina on 10/12/2017.
 */
@RunWith(Parameterized.class)
public class ParameterizedTestRomanNumerals {

    private String romanNumber;
    private int arabicNumber;

    public ParameterizedTestRomanNumerals(String romanNumber, int arabicNumber) {
        this.romanNumber = romanNumber;
        this.arabicNumber = arabicNumber;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"I", 1},
                {"III", 3},
                {"IV", 4},
                {"V", 5},
                {"VIII", 8},
                {"IX", 9},
                {"XIII", 13},
                {"XIV", 14},
                {"XIX", 19},
                {"XXIV", 24},
                {"XXIX", 29},
                {"XXX", 30},
                {"XXXIV", 34},
                {"XL", 40},
                {"XLV", 45},
                {"XLIX", 49},
                {"L", 50},
                {"LI", 51},
                {"LIX", 59},
                {"LXXX", 80},
                {"LXXXIX", 89},
                {"XC", 90},
                {"XCIX", 99},
                {"C", 100},
                {"CCC", 300},
                {"CD", 400},
                {"D", 500},
                {"DC", 600},
                {"DCCC", 800},
                {"CM", 900},
                {"M", 1000},
                {"MC", 1100},
                {"MMM", 3000},
                {"MCMLXXXIV", 1984},
                {"MMXIV", 2014}
        };
    }

    @Test
    public void test() throws Exception {
        assertThat(RomanNumerals.convertToInteger(romanNumber), is(arabicNumber));
    }
}
