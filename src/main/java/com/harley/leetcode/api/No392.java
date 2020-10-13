package com.harley.leetcode.api;

public class No392 {
    public boolean isSubsequence(String s, String t) {
        //标记每次匹配到t的下标
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            String c1 = String.valueOf(s.charAt(i));

            int temp = t.indexOf(c1, index);
            if(temp == -1) {
                return false;
            } else {
                index = temp + 1;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        No392 no392 = new No392();
        boolean subsequence = no392.isSubsequence("aa", "a");
        System.out.println(subsequence);
    }
}
