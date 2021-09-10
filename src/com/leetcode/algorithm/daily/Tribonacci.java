package com.leetcode.algorithm.daily;

public class Tribonacci {
    public static int tribonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }

        int[] f = new int[n+1];
        f[0]=0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            f[i] = f[i-1] + f[i-2] + f[i-3];
        }
        return f[n];

    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
