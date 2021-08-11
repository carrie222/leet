package com.niuke.huaweijishi;

import java.util.Scanner;

public class HJ1 {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        System.out.println(s[s.length - 1].length());
    }
}
