package com.niuke.huaweijishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().trim().toCharArray();
        char[] ch = br.readLine().trim().toCharArray();
        int num = 0;
        for (int i = 0; i < str.length; i++) {
            char ch1 = ch[0];
            if(Character.toLowerCase(ch1) == Character.toLowerCase(str[i])){
                num++;
            }

        }
        System.out.println(num);
    }
}
