package com.leetcode.algorithm.dp;

public class ClimbStairs {
    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(3));
    }
}
