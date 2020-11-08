package com.harley.leetcode.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No459 {
    public static void main(String[] args) {
        String x = "axx";
        int x1 = x.indexOf("x", 2);
        System.out.println(x1);
        String y = "aa";
        String[] as = y.split("a");
        System.out.println(as.length);

        No459 no459 = new No459();
        boolean abab = no459.repeatedSubstringPattern("a");
        System.out.println(abab);
    }

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        //截头去尾，学习思路
        return str.substring(1,str.length()-1).contains(s);
    }
}
