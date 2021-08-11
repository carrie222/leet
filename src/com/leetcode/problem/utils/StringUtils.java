package com.leetcode.problem.utils;

public class StringUtils {
    public static final int INDEX_NOT_FOUND = -1; ;

    public static int indexOf(String str, char searchChar, int startPos) {
        if (isEmpty(str)) {
            return INDEX_NOT_FOUND;
        }
        return str.indexOf(searchChar, startPos);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
