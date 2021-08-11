package com.leetcode.problem.daily;

public class IsCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];

        // 对查分数组进行处理
        for (int i = 0; i < ranges.length; i++) {
            diff[ranges[i][0]]++;
            diff[ranges[i][1] + 1]++;
        }

        // 根据查分数组处理前缀和，为理解方便单独定义sum，可以原地做
        int[] sum = new int[52];
        for (int i = 1; i <= 51; i++) {
            sum[i] = sum[i - 1] + diff[i];

        }

        // 从left到right判断是否满足sum>0
        for (int i = left; i <= right; i++) {
            if(sum[i] <= 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] ranges = new int[][]{{1,2},{3,4},{5,6}};
        int left = 2;
        int right = 5;
        System.out.println(new IsCovered().isCovered(ranges,left,right));

    }
}
