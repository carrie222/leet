package com.leetcode.algorithm.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1，先从root开始，深度优先遍历，构建哈希表。key父节点值
 * 2，从target开始，从三个方向深度优先搜索，左右结点，父节点。
 */
public class DistanceK {


    Map<Integer,TreeNode> parents = new HashMap<Integer,TreeNode>();
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        // 从root出发DFS，记录每个结点的父结点
        findParent(root);

        // 从target出发DFS，寻找所有深度为k的结点
        findAns(target,null,0,k);

        return ans;
    }

    private void findAns(TreeNode node, TreeNode from, int depth, int k) {
        if(node == null){
            return;
        }
        if(depth == k){
            ans.add(node.val);
            return;
        }

        if(node.left != from){
            findAns(node.left, node, depth + 1, k);
        }
        if(node.right != from){
            findAns(node.right, node, depth + 1, k);
        }
        if(parents.get(node.val) != from){
            findAns(parents.get(node.val),node,depth + 1, k);
        }
    }

    private void findParent(TreeNode node) {
        if (node.left != null) {
            parents.put(node.left.val, node);
            findParent(node.left);
        }
        if (node.right != null) {
            parents.put(node.right.val, node);
                findParent(node.right);
            }
        }
    }

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}