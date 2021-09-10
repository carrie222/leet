package com.leetcode.algorithm.daily;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathLength {
    public int shortestPathLength(int[][] graph){
        int ans = 0;
        int n = graph.length;
        Queue<int[]> queue = new LinkedList<int[]>();
        boolean[][] seen = new boolean[n][1 << n];
        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i, 1 << i, 0});
            seen[i][1 << i] = true;
        }
        while(!queue.isEmpty()){
            int[] tuple = queue.poll();
            int u = tuple[0], mask = tuple[1],dist = tuple[2];
            if(mask == (1 << n) - 1){
                ans = dist;
                break;
            }

            //搜索相邻的结点
            for(int v : graph[u]){
                // 将mark的第v位置为1
                int maskV = mask | (1 << v);
                if(!seen[v][maskV]){
                    queue.offer(new int[]{v, maskV, dist});
                    seen[v][maskV] =true;
                }
            }
        }
        return ans;
    }
}
