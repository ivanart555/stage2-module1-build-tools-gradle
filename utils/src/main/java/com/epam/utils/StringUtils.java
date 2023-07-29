package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str)) {
            double number = NumberUtils.toDouble(str, Double.NaN);
            return number > 0.0 && !Double.isNaN(number);
        } else return false;

    }
}
