package com.epam.tdd.homework.rtoa;

import com.epam.tdd.homework.RomanNumber;
import org.junit.Before;
import org.junit.Test;

public class RomanNumberExceptionTest {


    private RomanNumber romanNumber;

    @Before
    public void setup() {
        romanNumber = new RomanNumber();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenZero() {
        romanNumber.toRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenLessThanZero() {
        romanNumber.toRoman(-5);
    }
}
