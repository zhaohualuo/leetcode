package com.harley.leetcode.api;

/**
 * 4. 寻找两个正序数组的中位数
 *
 * 给定两个大小为 m 和 n 的正序（从小到大）数组nums1和nums2。请你找出并返回这两个正序数组的中位数。
 *
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 */
public class No4 {
    public static void main(String[] args) {
        No4 no4 = new No4();
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        double medianSortedArrays = no4.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int midIndex = (nums1.length + nums2.length) / 2;
        int jiou = (nums1.length + nums2.length) % 2;

        if (num1Len > num2Len) {
            //保证num1长度小于等于nums2，防止下面数组下标越界
            return findMedianSortedArrays(nums2,nums1);
        }

        int nums1Index = 0;
        int nums2Index = 0;

        while (true) {
            int k = (num1Len + num2Len) / 2;

            if (nums1Index + k/2 >= nums1.length) {
                //数组1下标越界了，下面仅剩下num2的数据了
                int index = (nums1.length + nums2.length) / 2 - nums1.length;
                if (jiou == 0) {
                    return (nums2[index] + nums2[index-1]) / 2;
                } else {
                    return nums2[index];
                }
            }

            if (nums2Index == midIndex || nums1Index == midIndex || nums2Index == midIndex-1 || nums1Index == midIndex-1) {
                if (jiou == 1) {
                    return Math.min(nums1[nums1Index],nums2[nums2Index]);
                } else {
                    return (nums1[nums1Index] + nums2[nums2Index]) / 2;
                }
            }

            if (nums1[nums1Index + k/2] > nums2[nums2Index + k/2]) {
                //舍弃nums2的前k/2个元素
                nums2Index += k/2;
                num2Len -= k/2;
            } else {
                //舍弃num1的前k/2个元素
                nums1Index += k/2;
                num1Len -= k/2;
            }

        }
    }
}
