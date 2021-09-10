package com.leetcode.algorithm.daily;

import java.util.*;

public class CountOfAtoms {
    int i, n;
    String formula;
    public String countOfAtoms(String formula) {
        this.i = 0;
        this.n = formula.length();
        this.formula = formula;

        Deque<Map<String, Integer>> stack = new LinkedList<>();
        stack.push(new HashMap<String, Integer>());
        while(i < n){
            char ch = formula.charAt(i);
            if(ch == '('){
                i++;
                // 将一个空的哈希表压入栈中，准备统计括号内的原子数量
                stack.push(new HashMap<String, Integer>());
            }else if(ch == ')'){
                i++;
                // 括号右侧数字
                int num = parseNum();
                // 弹出括号内的原子数量
                Map<String, Integer> popMap = stack.pop();
                Map<String, Integer> topMap = stack.peek();
                for(Map.Entry<String, Integer> entry : popMap.entrySet()){
                    String atom = entry.getKey();
                    int v = entry.getValue();
                    // 将括号内的原子数量乘上num, 加上
                    topMap.put(atom, topMap.getOrDefault(atom, 0) + v * num);
                }
            }else{
                String atom = parseAtom();
                int num = parseNum();
                Map<String, Integer> topMap = stack.peek();
                topMap.put(atom, topMap.getOrDefault(atom, 0) + num);
            }
        }

        Map<String, Integer> map = stack.pop();
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(map);
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<String,Integer> entry : treeMap.entrySet()){
            String atom = entry.getKey();
            int count = entry.getValue();
            sb.append(atom);
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    private int parseNum() {
        // 不是数字，视作1
        if(i == n || !Character.isDigit(formula.charAt(i))){
            return 1;
        }
        int num = 0;
        // 扫描数字
        while(i < n && Character.isDigit(formula.charAt(i))){
            num = num * 10 + formula.charAt(i++) - '0';
        }
        return num;
    }

    private String parseAtom() {
        StringBuffer sb = new StringBuffer();
        // 扫描首字母
        sb.append(formula.charAt(i++));
        while(i < n && Character.isLowerCase(formula.charAt(i))){
            // 扫描首字母后的小写字母
            sb.append(formula.charAt(i++));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String formula = "H2O";
        System.out.println(new CountOfAtoms().countOfAtoms(formula));
    }
}
