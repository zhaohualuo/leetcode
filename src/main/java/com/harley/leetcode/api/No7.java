package com.harley.leetcode.api;

/**
 * 7. 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 */
public class No7 {
    public static void main(String[] args) {
        No7 no7 = new No7();
        int reverse = no7.reverse(1213);
        System.out.println(reverse);
    }

    public int reverse(int x) {
        long n = 0;
        while (x / 10 != 0) {
            n = n*10 + x%10;
            x = x / 10;
        }
        long end = n*10 + x%10;
        //处理超出int最大值的问题
        double max = Math.pow(2,31) - 1;
        double min = -Math.pow(2,31);
        if (end <= max && end >= min) {
            return (int)end;
        } else {
            return 0;
        }
    }
}
