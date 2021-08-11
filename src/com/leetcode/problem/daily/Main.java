package com.leetcode.problem.daily;

public class Main {
    public static void main(String[] args) {
        int[] nums = null;
        System.out.println(new Main().removeDuplicates(nums));
    }
    public int  removeDuplicates(int[] nums){
        if( nums == null || nums.length == 0){
            return nums.length;
        }

        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            int right = nums[i];
            if(nums[left] != right){
                nums[++left] = right;
            }
        }
        return ++left;
    }
}
