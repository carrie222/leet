package com.leetcode.problem.test;

import java.util.Iterator;
import java.util.TreeMap;

public class keySort {
    public static void main(String[] args) {
        TreeMap<String, String> params = new TreeMap<>();
        params.put("ZKK", "15");
        params.put("AT", "1525524700740");
        params.put("NONCESTR", "1522115166482");
        params.put("PASSWORD", "123456");
        params.put("PHONEID", "android");
        params.put("PHONEIP", "PHONEIP");
        params.put("USERNAME", "13800000001");
        params.put("APPID", "A80C1A90A90C4260B52CB8FE559F70BD");
        System.out.println(params);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        Iterator<String> iter = params.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            sb.append(key);
            String value = params.get(key);
            sb1.append(value);
        }

        System.out.println(sb);
        System.out.println(sb1);



    }

}
