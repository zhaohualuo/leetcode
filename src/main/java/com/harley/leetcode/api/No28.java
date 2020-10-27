package com.harley.leetcode.api;

/**
 * 28. 实现 strStr()
 */
public class No28 {
    public static void main(String[] args) {
        No28 no28 = new No28();
        int i = no28.strStr("hello", "ll");
        System.out.println(i);
    }

    public int strStr(String haystack, String needle) {
        //先处理特殊情况
        if (needle == null || "".equals(needle)) {
            return 0;
        }

        if (haystack.contains(needle)) {
            //确定包含了，然后取下标
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
