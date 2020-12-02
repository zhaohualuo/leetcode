package com.harley.leetcode.api;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1356. 根据数字二进制下 1 的数目排序
 *
 * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 *
 * 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
 *
 * 请你返回排序后的数组。
 *
 * 输入：arr = [0,1,2,3,4,5,6,7,8]
 *  输出：[0,1,2,4,8,3,5,6,7]
 *  解释：[0] 是唯一一个有 0 个 1 的数。
 *  [1,2,4,8] 都有 1 个 1 。
 *  [3,5,6] 有 2 个 1 。
 *  [7] 有 3 个 1 。
 *  按照 1 的个数排序得到的结果数组为 [0,1,2,4,8,3,5,6,7]
 */
public class No1356 {
    public static void main(String[] args) {
        No1356 no1356 = new No1356();
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] ints = no1356.sortByBits(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public int[] sortByBits(int[] arr) {
        //Integer::bitCount统计二进制下1的数量
        return Arrays.stream(arr).boxed()
                .sorted(Comparator
                        .comparingInt(Integer::bitCount)
                        .thenComparing(Integer::compare))
                .mapToInt(Integer::intValue).toArray();
    }
}
