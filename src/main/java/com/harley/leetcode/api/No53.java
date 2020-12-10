package com.harley.leetcode.api;

/**
 * 53. 最大子序和
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class No53 {
    public static void main(String[] args) {
        No53 no53 = new No53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = no53.maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums) {
        //最大连续和
        int maxSum = nums[0];
        //持续累加和
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
