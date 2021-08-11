package com.niuke.huaweijishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HJ4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            String str = line.trim();
            int len = str.length();
            ArrayList<String> arr = new ArrayList<>();
            int a = len / 8;
            int b = len % 8;
//            System.out.println(b);
            for (int i = 0; i <= a - 1; i++) {
                String s = str.substring((i * 8), (i+1)* 8);
//                System.out.println(s);
                arr.add(s);
            }
            str = str.substring(a * 8 , len);
            for (int i = 0; i < 8 - b; i++) {
                str = str + '0';
            }
            arr.add(str);

            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }


    }
}
