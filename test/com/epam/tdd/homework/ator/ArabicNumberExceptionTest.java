package com.epam.tdd.homework.ator;

import com.epam.tdd.homework.ArabicNumber;
import org.junit.Before;
import org.junit.Test;

public class ArabicNumberExceptionTest {


    private ArabicNumber arabicNumber;

    @Before
    public void setup() {
        arabicNumber = new ArabicNumber();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNull() {
        arabicNumber.toArabic(null);
    }
}
