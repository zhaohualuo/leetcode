package com.harley.leetcode.api;

import java.util.Arrays;

/**
 * 976. 三角形的最大周长
 *
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 *
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 * 例：
 * 输入：[3,2,3,4]
 * 输出：10
 */
public class No976 {
    public static void main(String[] args) {
        No976 no976 = new No976();
        int[] A = {3,6,2,3};
        int i = no976.largestPerimeter(A);
        System.out.println(i);
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int end = 0;
        for (int i = A.length-1; i >= 2; i--) {
            int max = A[i];
            int mid = A[i-1];
            int min = A[i-2];

            if (max < mid + min) {
                end = max + mid + min;
                break;
            }
        }
        return end;
    }
}
