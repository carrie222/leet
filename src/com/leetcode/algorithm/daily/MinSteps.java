package com.leetcode.algorithm.daily;

import java.util.HashMap;
import java.util.Map;

public class MinSteps {
    public int minSteps(int n) {
        int[] dp = new int[n+1];
        if(n == 1){
            dp[1] = 0;
        }
        if(n == 2){
            dp[2] = 2;
        }
        if(n == 3){
            dp[3] = 3;
        }
        if(n > 3){
            dp[1] = 0;
            dp[2] = 2;
            dp[3] = 3;
        }
        for (int i = 4; i < n+1; i++) {
           Map<Integer, Integer> map;
           int res = i;
           map = getFactors(i);
           for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                res = Math.min(dp[entry.getKey()] + dp[entry.getValue()],res);
            }
           dp[i] = res;
        }
        return dp[n];
    }

    public static Map<Integer,Integer> getFactors(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                map.put(i, n / i);
            }
        }
        return map;

    }

    public static void main(String[] args) {
        System.out.println(new MinSteps().minSteps(4));
    }
}
