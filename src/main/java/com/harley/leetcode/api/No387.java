package com.harley.leetcode.api;

public class No387 {
    public static void main(String[] args) {
        int cc = firstUniqChar("cc");
        //System.out.println(loveleetcode);
        System.out.println(cc);
    }

    public static int firstUniqChar(String s) {
        for(int i = 0 ; i < s.length(); i++) {
            char temp = s.charAt(i);
            int first = s.indexOf(temp);
            int end = s.indexOf(temp,first+1);

            if(end == -1) {
                return first;
            }
        }
        return -1;
    }
}
