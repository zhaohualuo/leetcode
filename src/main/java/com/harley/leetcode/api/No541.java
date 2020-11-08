package com.harley.leetcode.api;

/**
 * 541. 反转字符串 II
 */
public class No541 {

    public static void main(String[] args) {
        No541 no541 = new No541();
        String abcdefg = no541.reverseStr("abcdefg", 2);
        System.out.println(abcdefg);
    }

    public String reverseStr(String s, int k) {
        StringBuilder newStr = new StringBuilder();
        int i = s.length() / k +1;
        for (int j = 0; j < i; j++) {
            String temp = s.substring(k*j,Math.min(k*(j+1),s.length()));
            if (j % 2 == 0) {
                //反转
                temp = new StringBuilder(temp).reverse().toString();
            }
            newStr.append(temp);
        }
        return newStr.toString();
    }
}
