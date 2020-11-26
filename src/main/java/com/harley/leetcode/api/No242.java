package com.harley.leetcode.api;

import java.util.Arrays;

/**
 * 排序类
 * 242. 有效的字母异位词
 */
public class No242 {
    public static void main(String[] args) {
        No242 no242 = new No242();
        boolean anagram = no242.isAnagram("anagram", "nagaram");
        System.out.println(anagram);
    }

    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        return Arrays.toString(sChar).equals(Arrays.toString(tChar));
    }
}
