package com.leetcode.algorithm.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date parseDate(String str, String[] parsePatterns) throws ParseException {
        return parseDateWithLeniency(str, parsePatterns, true);
    }

    private static Date parseDateWithLeniency(String str, String[] parsePatterns,
                                              boolean lenient) throws ParseException {
        if (str == null || parsePatterns == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }

        SimpleDateFormat parser = new SimpleDateFormat();
        parser.setLenient(lenient);
        ParsePosition pos = new ParsePosition(0);
        for (int i = 0; i < parsePatterns.length; i++) {

            String pattern = parsePatterns[i];

            // LANG-530 - need to make sure 'ZZ' output doesn't get passed to SimpleDateFormat
            if (parsePatterns[i].endsWith("ZZ")) {
                pattern = pattern.substring(0, pattern.length() - 1);
            }

            parser.applyPattern(pattern);
            pos.setIndex(0);

            String str2 = str;
            // LANG-530 - need to make sure 'ZZ' output doesn't hit SimpleDateFormat as it will ParseException
            if (parsePatterns[i].endsWith("ZZ")) {
                int signIdx  = indexOfSignChars(str2, 0);
                while (signIdx >=0) {
                    str2 = reformatTimezone(str2, signIdx);
                    signIdx = indexOfSignChars(str2, ++signIdx);
                }
            }

            Date date = parser.parse(str2, pos);
            if (date != null && pos.getIndex() == str2.length()) {
                return date;
            }
        }
        throw new ParseException("Unable to parse the date: " + str, -1);
    }

    private static int indexOfSignChars(String str, int startPos) {
        int idx = StringUtils.indexOf(str, '+', startPos);
        if (idx < 0) {
            idx = StringUtils.indexOf(str, '-', startPos);
        }
        return idx;
    }

    private static String reformatTimezone(String str, int signIdx) {
        String str2 = str;
        if (signIdx >= 0 &&
                signIdx + 5 < str.length() &&
                Character.isDigit(str.charAt(signIdx + 1)) &&
                Character.isDigit(str.charAt(signIdx + 2)) &&
                str.charAt(signIdx + 3) == ':' &&
                Character.isDigit(str.charAt(signIdx + 4)) &&
                Character.isDigit(str.charAt(signIdx + 5))) {
            str2 = str.substring(0, signIdx + 3) + str.substring(signIdx + 4);
        }
        return str2;
    }
}
