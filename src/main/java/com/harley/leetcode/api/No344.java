package com.harley.leetcode.api;

/**
 * 344. 反转字符串
 */
public class No344 {

    public static void main(String[] args) {
        No344 no344 = new No344();
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        no344.reverseString(arr);
    }

    public void reverseString(char[] s) {
        int len = s.length;
        if(len <= 1) {
            System.out.println(s);
        }
        for(int i=0; i < len/2; i++) {
            char temp = s[i];
            s[i] = s[len-1-i];
            s[len-1-i] = temp;
        }
        System.out.println(s);
    }
}
