package com.leetcode.algorithm.daily;

public class FIb {
    public static int fib(int n){
        int[] f = new int[n+1];
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(3) );
    }

}
