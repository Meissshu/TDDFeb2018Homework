package com.epam.tdd.homework.rtoa;

import com.epam.tdd.homework.RomanNumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumberConvertTest {

    private int input;
    private String expected;
    private RomanNumber romanNumber;

    public RomanNumberConvertTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // simple test cases
                {1000, "M"},
                {900, "CM"},
                {500, "D"},
                {400, "CD"},
                {100, "C"},
                {90, "XC"},
                {50, "L"},
                {40, "XL"},
                {10, "X"},
                {9, "IX"},
                {5, "V"},
                {4, "IV"},
                {1, "I"},

                // some random test cases
                {394, "CCCXCIV"},
                {416, "CDXVI"},
                {218, "CCXVIII"},
                {128, "CXXVIII"},
                {97, "XCVII"},
                {754, "DCCLIV"},
                {999, "CMXCIX"},
        });
    }

    @Before
    public void setup() {
        romanNumber = new RomanNumber();
    }

    @Test
    public void shouldReturnExpectedWhenInput() {
        String result = romanNumber.toRoman(input);
        assertEquals(expected, result);
    }
}
