package com.harley.leetcode.api;

import java.util.Arrays;

/**
 * 1502. 判断能否形成等差数列
 */
public class No1502 {
    public static void main(String[] args) {
        No1502 no1502 = new No1502();
        int[] arr = {1,5,3};
        boolean b = no1502.canMakeArithmeticProgression(arr);
        System.out.println(b);
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i+1] - arr[i] != arr[i+2] - arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
