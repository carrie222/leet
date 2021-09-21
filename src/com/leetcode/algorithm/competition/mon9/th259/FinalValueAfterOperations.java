package com.leetcode.algorithm.competition.mon9.th259;

public class FinalValueAfterOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("+")){
                ans += 1;
            }else{
                ans -= 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(str));
    }
}
