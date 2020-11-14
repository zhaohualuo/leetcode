package com.harley.leetcode.api;

/**
 * 696. 计数二进制子串
 */
public class No696 {

    public static void main(String[] args) {
        No696 no696 = new No696();
        //int i = no696.countBinarySubstrings("00110011");
        //int i = no696.countBinarySubstrings("10101");
        //int i = no696.countBinarySubstrings("00110");
        //int i = no696.countBinarySubstrings("000111000");
        int i = no696.countBinarySubstrings("11110011");
        System.out.println(i);
    }

    /**
     * 原则：只有前后两个值不相等时才会出现数量增加的情况
     * 特殊情况：前后两个值不相等时： 01或者10  这时候肯定加1
     *         同时需判断 0011 000111 11110000 这种情况，可能一次要加2， 因为包含 01 0011 这两种情况
     *         若 000111 这时候要加3， 01 0011 000111
     */
    public int countBinarySubstrings(String s) {
        //记录总数
        int count = 0;
        //当前重复数
        int temp = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                temp ++;
            } else {
                count++;

                int tempJ = temp;
                for (int j = 0; j < tempJ; j++) {
                    if (temp > 1 && (i + temp + 1) <= s.length()) {
                        String substring = s.substring(i + 1, i + temp + 1);
                        if (substring.contains("0") && substring.contains("1")) {
                            temp--;
                            continue;
                        } else {
                            count += temp -1;
                            break;
                        }
                    }
                    temp--;
                }
                temp = 1;
            }
        }
        return count;
    }
}
