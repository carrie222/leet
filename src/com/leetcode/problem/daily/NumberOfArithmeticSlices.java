package com.leetcode.problem.daily;

import java.util.HashMap;
import java.util.Map;

public class NumberOfArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] nums) {

        int ans = 0;
        // nums length
        int n = nums.length;
        Map<Long, Integer>[] f = new Map[n];
        // 给数组内newmap
        for (int i = 0; i < n; ++i) {
            f[i] = new HashMap<Long, Integer>();
        }
        // 开始遍历数据

        // 第一次 i = 0 j<i 不进入小循环
        // 第二次 i = 1 j<i 成立 进入小循环 此时 i =1 j= 0

        // 第三次 i = 2 j<i 成立 进入小循环 此时 i = 2 j= 0
        for (int i = 0; i < n; ++i) {
            // 开始遍历组合
            for (int j = 0; j < i; ++j) {
                // 计算等差数列

                /**
                 *    6- 4
                 *    6 - 6
                 *    6-8
                 *
                 *    8 - 2
                 *    8 - 4
                 *     8 - 6
                 *
                 */
                // d是计算出的差值 i - j

                // 第二次 4 -2 =2
                // 第二次 6 - 2 = 4
                // 6 - 4 = 2
                long d = 1L * nums[i] - nums[j];
                // 1 2 3 4 5 6
                // 去map中get  j小循环

                // 第二次 d = 2
                /**
                 * 如果命中返回d的value
                 * 不命中返回0
                 */
                // 第二次 cnt = 0
                // 第二次 cnt = o
                // 第二次的小循环 j = 1
                // cnt =1
                // 只要命中就算一次等差数列
                int cnt = f[j].getOrDefault(d, 0);

                // value 永远为1 ans+1

                // 第二次 ans = 0
                // 算一次有效等差数列
                if(cnt == 1){
                    System.out.println(cnt + ":" + d +":" + i + ":" +j + ":");

                }
                System.out.println(ans);
                ans += cnt;

                // 大循环的数组 put 大循环

                // i = 1  2 value 1
                // i =2  4

                // put 大循环i 当前差值  (当前大循环map 获取差值为key)
                //
//                System.out.println(f[i].getOrDefault(d, 0) + cnt + 1);
                // 没有命中 value  = 1
                // !=1 就是当前数列长度 cnt = 遍历j 是有多少次命中等差数列 + 1
                f[i].put(d, f[i].getOrDefault(d, 0) + cnt + 1);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6,8,10};
        int ans = numberOfArithmeticSlices(nums);
        System.out.println(ans);
    }

}
