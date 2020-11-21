package com.harley.leetcode.api;

import java.util.Arrays;

/**
 * 917. 仅仅反转字母
 */
public class No917 {
    public static void main(String[] args) {
        No917 no917 = new No917();
        String s = no917.reverseOnlyLetters("7_28]");
        System.out.println(s);
    }

    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int start = 0;
        int end = S.length()-1;
        while (start < end) {
            while (!((chars[start] >= 'a' && chars[start] <='z') || (chars[start] >= 'A' && chars[start] <='Z'))) {
                //不属于字母
                if (start >= end) {
                    break;
                }
                start++;

            }
            while (!((chars[end] >= 'a' && chars[end] <='z') || (chars[end] >= 'A' && chars[end] <='Z'))) {
                //不属于字母
                if (start >= end) {
                    break;
                }
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;

        }
        return String.valueOf(chars);
    }
}
