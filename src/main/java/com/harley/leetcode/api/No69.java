package com.harley.leetcode.api;

/**
 * 69. x 的平方根
 *
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class No69 {
    public static void main(String[] args) {
        No69 no69 = new No69();
        int i = no69.mySqrt(8);
        System.out.println(i);
    }

    public int mySqrt(int x) {
        // 注意：针对特殊测试用例，例如 2147395599
        // 要把搜索的范围设置成长整型

        if (x==1) {
            return 1;
        }

        //用二分法迅速定位
        long result = x/2;

        //头指针
        long pre = 0;
        //尾指针
        long end = x;
        while (result * result > x || (result + 1) * (result + 1) <= x) {

            if (result * result <= x) {
                pre = result;
            } else {
                end = result;
            }
            result = (pre + end) / 2;
        }

        return (int)result;
    }
}
