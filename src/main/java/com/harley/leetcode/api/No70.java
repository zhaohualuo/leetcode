package com.harley.leetcode.api;

/**
 * 70. 爬楼梯
 */
public class No70 {

    /**
     * 参考官方解析-动态规划解法
     * x(0) = 1;
     * x(1) = 1;
     * x(2) = 2;
     * x(3) = 3;
     * x(4) = 5;
     * x(5) = 8;
     */
    public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p+q;
        }
        return r;
    }
}
