package com.harley.leetcode.api;

/**
 * 557. 反转字符串中的单词 III
 */
public class No557 {
    public static void main(String[] args) {
        No557 no557 = new No557();
        String s = no557.reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] s1 = s.split(" ");
        StringBuilder reverse = new StringBuilder(s1[0]).reverse();
        stringBuilder.append(reverse);

        for (int i = 1; i < s1.length; i++) {
            StringBuilder reverse2 = new StringBuilder(s1[i]).reverse();
            stringBuilder.append(" ").append(reverse2);
        }

        return stringBuilder.toString();
    }
}
