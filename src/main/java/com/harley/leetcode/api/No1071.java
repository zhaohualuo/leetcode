package com.harley.leetcode.api;

/**
 * 1071. 字符串的最大公因子
 */
public class No1071 {
    public static void main(String[] args) {
        No1071 no1071 = new No1071();
        String strings = no1071.gcdOfStrings("A","AbAb");
        System.out.println(strings);
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 < len2) {
            for (int i = 0; i < len1; i++) {
                String substring = str1.substring(0, len1 - i);
                if (str2.split(substring).length == 0 && str1.split(substring).length == 0) {
                    return str1.substring(0,len1-i);
                }
            }
        } else {
            for (int i = 0; i < len2; i++) {
                String substring = str2.substring(0, len2 - i);
                if (str1.split(substring).length == 0 && str2.split(substring).length == 0) {
                    return str2.substring(0,len2-i);
                }
            }
        }

        return "";
    }
}
