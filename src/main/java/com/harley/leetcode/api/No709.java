package com.harley.leetcode.api;

/**
 * 709. 转换成小写字母
 */
public class No709 {
    public static void main(String[] args) {
        No709 no709 = new No709();
        String hello = no709.toLowerCase("Hello");
        hello.toLowerCase();
        System.out.println(hello);
    }

    public String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                int a = str.charAt(i) + 32;
                stringBuilder.append((char)a);
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
