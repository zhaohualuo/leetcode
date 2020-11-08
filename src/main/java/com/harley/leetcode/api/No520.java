package com.harley.leetcode.api;

/**
 * 520. 检测大写字母
 */
public class No520 {

    public static void main(String[] args) {
        No520 no520 = new No520();
        boolean sbhucsabj = no520.detectCapitalUse("cbhucssabj");
        System.out.println(sbhucsabj);
    }

    public boolean detectCapitalUse(String word) {
        //如果全是大写
        String s = word.toUpperCase();
        if (s.equals(word)) {
            return true;
        }
        //如果全是小写
        String s1 = word.toLowerCase();
        if (s1.equals(word)) {
            return true;
        }
        //如果仅第一个字母是大写
        String substring = s1.substring(1);
        if (substring.equals(word.substring(1))) {
            return true;
        }

        return false;
    }
}
