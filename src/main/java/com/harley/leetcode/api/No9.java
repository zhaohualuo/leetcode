package com.harley.leetcode.api;

/**
 * 9. 回文数
 */
public class No9 {
    public static void main(String[] args) {
        No9 no9 = new No9();
        boolean palindrome = no9.isPalindrome(1);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        //保留初始值
        int y = x;

        if (x < 0) {
            return false;
        }

        int a = 0;
        while (y / 10 != 0) {
            a = a * 10 + y % 10;
            y = y / 10;
        }
        a = a * 10 + x % 10;

        return a == x;
    }
}
