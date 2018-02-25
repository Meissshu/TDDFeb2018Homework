package com.epam.tdd.homework.ator;

import com.epam.tdd.homework.ArabicNumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ArabicNumberConvertTest {

    private String input;
    private int expected;
    private ArabicNumber arabicNumber;

    public ArabicNumberConvertTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"M", 1000},
                {"CM", 900},
                {"D", 500},
                {"CD", 400},
                {"C", 100},
                {"XC", 90},
                {"L", 50},
                {"XL", 40},
                {"X", 10},
                {"IX", 9},
                {"V", 5},
                {"IV", 4},
                {"I", 1},

                // some random test cases
                {"CCCXCIV", 394},
                {"CDXVI", 416},
                {"CCXVIII", 218},
                {"CXXVIII", 128},
                {"XCVII", 97},
                {"DCCLIV", 754},
                {"CMXCIX", 999},
                }
        );
    }

    @Before
    public void setup() {
        arabicNumber = new ArabicNumber();
    }

    @Test
    public void shouldReturnExpectedWhenInput() {
        int result = arabicNumber.toArabic(input);
        assertEquals(expected, result);
    }
}
