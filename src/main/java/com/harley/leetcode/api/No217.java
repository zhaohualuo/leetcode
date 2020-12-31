package com.harley.leetcode.api;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class No217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {
        //用hash表判断
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean result = set.add(num);
            if (!result) {
                return true;
            }
        }
        return false;
    }
}
