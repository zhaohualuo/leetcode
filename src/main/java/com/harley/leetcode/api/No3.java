package com.harley.leetcode.api;

/**
 * 3. 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class No3 {
    public static void main(String[] args) {
        No3 no3 = new No3();
        int abcabcbb = no3.lengthOfLongestSubstring("ab ");
        System.out.printf(String.valueOf(abcabcbb));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String s1 = String.valueOf(s.charAt(j));
                if (s.substring(i,j).contains(s1)) {
                    break;
                }

                if (max < (j - i + 1)) {
                    max = j - i + 1;
                }
            }
        }
        return max;
    }
}
