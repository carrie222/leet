package com.leetcode.algorithm.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat parser = new SimpleDateFormat();
        parser.setLenient(true);
        System.out.println(parser);
        ParsePosition pos = new ParsePosition(0);
    }
}

