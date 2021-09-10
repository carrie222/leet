package com.leetcode.algorithm.daily;

import java.util.Arrays;

public class BuildArray {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,1,5,3,4};
        int[] arr = new BuildArray().buildArray(nums);
        System.out.println(Arrays.toString(arr));
    }
}
