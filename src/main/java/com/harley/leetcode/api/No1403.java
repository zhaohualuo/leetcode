package com.harley.leetcode.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1403. 非递增顺序的最小子序列
 */
public class No1403 {
    public static void main(String[] args) {
        No1403 no1403 = new No1403();
        int[] nums = {4,4,7,6,7};
        List<Integer> integers = no1403.minSubsequence(nums);
        System.out.println(integers);
    }

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> endList = new ArrayList<>();
        if (nums.length == 1) {
            endList.add(nums[0]);
        }

        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();

        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp += nums[i];
            endList.add(nums[i]);
            if (temp > sum - temp) {
                break;
            }
        }
        return endList;
    }
}
