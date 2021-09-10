package com.leetcode.algorithm.daily;

public class LongestPalindromeSubseq {
    public static int longestPalindromeSubseq(String s){
        int n  = s.length();
        // 用 dp[i][j]表示字符串 s 的下标范围 [i, j] 内的最长回文子序列的长度。
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i - 1 ; j >= 0; j--) {
                char c2 = s.charAt(j);
                if(c1 == c2){
                    dp[i][j] = dp[i - 1][j + 1] + 2;
                }else {
                    dp[i][j] =Math.max(dp[i-1][j],dp[i][j + 1]) ;

                }
            }
        }
//        for (int i = n - 1; i >=  0; i--) {
//            dp[i][i] = 1;
//            char c1 = s.charAt(i);
//            for (int j = i+1; j < n; j++) {
//                char c2 = s.charAt(j);
//                if(c1 == c2){
//                    dp[i][j] = dp[i+1][j-1] + 2;
//                }else {
//                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
//                }
//            }
//        }
        return dp[n-1][0];
    }

    public static void main(String[] args) {
        String s = "bbbab";
        int ans = longestPalindromeSubseq(s);
        System.out.println(ans);
    }
}
