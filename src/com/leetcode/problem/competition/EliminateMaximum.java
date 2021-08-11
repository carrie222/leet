package com.leetcode.problem.competition;

import java.util.Arrays;

public class EliminateMaximum {
    public int eliminateMaximum(int[] dist, int[] speed) {
       int n = dist.length;
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = (dist[i] - 1) / speed[i];
        }
        Arrays.sort(times);
        for (int i = 0; i < n; i++) {
            if(times[i] < i){
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] dist = {1,3,4};
        int[] speed = {1,1,1};
        System.out.println(new EliminateMaximum().eliminateMaximum(dist, speed));

    }
}
