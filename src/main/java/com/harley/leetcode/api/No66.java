package com.harley.leetcode.api;

/**
 * 66. 加一
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class No66 {
    public static void main(String[] args) {
        No66 no66 = new No66();
        int[] arr = {9,9,8};
        int[] ints = no66.plusOne(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int jinwei = 0;
        digits[len-1] = digits[len-1] + 1;
        int[] end1 = new int[len];
        int[] end2 = new int[len + 1];
        for (int i = len - 1; i >= 0; i--) {
            if (jinwei + digits[i] >= 10) {
                end1[i] = jinwei + digits[i] - 10;
                end2[i] = jinwei + digits[i] - 10;
                jinwei = 1;
            } else {
                end1[i] = jinwei + digits[i];
                end2[i] = jinwei + digits[i];
                jinwei = 0;
            }
        }
        if (jinwei != 0) {
            end2[0] = jinwei;
            return end2;
        } else {
            return end1;
        }
    }
}
