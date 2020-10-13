package com.harley.leetcode.api;

public class No1486 {

    public static void main(String[] args) {
        xorOperation(5,0);
    }

    public static int xorOperation(int n, int start) {
        int now = start;
        for(int i = 1 ; i < n ; i++) {
            now = now ^ (start + 2 * i);
        }
        return now;
    }
}
