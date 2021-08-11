package com.leetcode.problem.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat parser = new SimpleDateFormat();
        parser.setLenient(true);
        System.out.println(parser);
        ParsePosition pos = new ParsePosition(0);
    }
}

