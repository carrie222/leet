package com.leetcode.algorithm.competition;

public class CountGoodNumbers {
    public int countGoodNumbers(long n) {
        for (int num = 0; num < n; num++) {

        }
        return 0;
    }


    // 判断一个数是否是偶数
    public boolean judgeEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    // 判断一个数是质数
    public boolean judgePrime(int num){
        for (int i = 0; i <= num / 2; i++) {
            if(num % i == 0){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }
}
