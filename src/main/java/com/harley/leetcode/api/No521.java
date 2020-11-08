package com.harley.leetcode.api;

/**
 * 521. 最长特殊序列 Ⅰ
 */
public class No521 {

    public static void main(String[] args) {
        No521 no521 = new No521();
        int luSlength = no521.findLUSlength("aaa", "anba");
        System.out.println(luSlength);
    }

    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(),b.length());
    }
}
