package com.leetcode.problem.daily;

public class Search {
    public int search(int[] nums, int target) {
        if(target > nums[nums.length - 1] || target < nums[0]){
            return 0;
        }
        int mid = nums.length / 2;
        return mid;
    }

}
