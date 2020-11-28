package com.harley.leetcode.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 */
public class No349 {
    public static void main(String[] args) {
        No349 no349 = new No349();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] intersection = no349.intersection(nums1, nums2);
        System.out.println(intersection.length);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        //存在这种情况就是故意浪费我一次提交
        if (nums1.length == 0) {
            return nums1;
        }
        if (nums2.length == 0) {
            return nums2;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();

        //每次都拿第一个数组的某个数字去第二个数组匹配，耗时会长
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while(nums1[i] != nums2[j]) {
                if (j == nums2.length-1) {
                    break;
                }
                j++;
            }
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
            }
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
