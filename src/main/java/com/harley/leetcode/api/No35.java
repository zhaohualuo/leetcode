package com.harley.leetcode.api;

import java.util.Arrays;

/**
 * 35. 搜索插入位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class No35 {
    public static void main(String[] args) {
        No35 no35 = new No35();
        int[] a = {1,4,6,7,8,9};
        int i = no35.searchInsert(a, 6);
        System.out.println(i);
    }

    public int searchInsert(int[] nums, int target) {
        int[] ints = Arrays.stream(nums).sorted().toArray();
        int len = nums.length;
        int mid = len / 2;

        //特殊情况
        if (target <= ints[0]) {
            return 0;
        } else if (target == ints[len - 1]) {
            return len - 1;
        } else if (target > ints[len - 1]){
            return len;
        }

        //二分法
        while(target < ints[mid-1] || target > ints[mid]) {
            if (target > ints[mid]) {
                mid = (mid + len) / 2;
            } else {
                len = mid;
                mid = mid / 2;
            }
        }

        return target == ints[mid - 1] ? mid-1 : mid;
    }
}
