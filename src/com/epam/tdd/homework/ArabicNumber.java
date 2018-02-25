package com.epam.tdd.homework;

import java.util.LinkedHashMap;

public class ArabicNumber {

    private final LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

    {
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
    }

    public final int toArabic(String romanNumber) {
        if (romanNumber == null) {
            throw new IllegalArgumentException();
        }

        if (romanNumber.length() > 0) {
            for (String key : map.keySet()) {
                if (romanNumber.startsWith(key)) {
                    return map.get(key) + toArabic(romanNumber.replaceFirst(key, ""));
                }
            }
        }

        return 0;
    }
}
