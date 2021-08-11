package com.niuke.huaweijishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            int n = Integer.parseInt(line.trim());
            HashSet<Integer> set = new HashSet<Integer>(n);
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(br.readLine().trim()));
            }
            ArrayList<Integer> list = new ArrayList<Integer>(set);
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }
}


//
//3
//        2
//        2
//        1
//        11
//        10
//        20
//        40
//        32
//        67
//        40
//        20
//        89
//        300
//        400
//        15