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
        int[] nums1 = {0,0};
        int[] nums2 = {-1,1};
        double medianSortedArrays = no4.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int midIndex = (nums1.length + nums2.length) / 2;
        int jiou = (nums1.length + nums2.length) % 2;

        int nums1Index = 0;
        int nums2Index = 0;

        while (true) {
            int k = (num1Len + num2Len) / 2;

            if (nums1Index + k/2 >= nums1.length || num1Len == 0) {
                //数组1下标越界了，下面仅剩下num2的数据了
                int index = (nums1.length + nums2.length) / 2 - nums1.length;
                if (jiou == 0) {
                    if (index == 0) {
                        return (nums2[index] + nums1[nums1.length-1]) / 2.0;
                    } else {
                        return (nums2[index] + nums2[index-1]) / 2.0;
                    }
                } else {
                    return nums2[index];
                }
            }

            if (nums2Index + k/2 >= nums2.length || num2Len == 0) {
                //数组2下标越界了，下面仅剩下num1的数据了
                int index = (nums1.length + nums2.length) / 2 - nums2.length;
                if (jiou == 0) {
                    if (index == 0) {
                        return (nums1[index] + nums2[nums2.length-1]) / 2.0;
                    } else {
                        return (nums1[index] + nums1[index-1]) / 2.0;
                    }
                } else {
                    return nums1[index];
                }
            }

            if ((nums1Index + nums2Index == midIndex || k/2 == 0) && num1Len != 0) {
                //剩三个元素时特殊处理
                if (num1Len + num2Len == 3) {
                    if (nums1[nums1Index] < nums2[nums2Index]) {
                        if (jiou == 1) {
                            return nums2[nums2Index];
                        } else {
                            int temp = 0;
                            if (nums2Index == 0) {
                                temp = nums1[nums1Index];
                            } else {
                                temp = Math.max(nums1[nums1Index],nums2[nums2Index-1]);
                            }

                            return (temp + nums2[nums2Index]) / 2.0;
                        }
                    } else {
                        if (jiou == 1) {
                            return nums1[nums1Index];
                        } else {
                            int temp = 0;
                            if (nums2Index == 0) {
                                temp = nums2[nums2Index];
                            } else {
                                temp = Math.max(nums2[nums2Index],nums1[nums1Index-1]);
                            }
                            return (temp + nums1[nums1Index]) / 2.0;
                        }
                    }
                }
                //剩两个元素时
                return (nums2[nums2Index] + nums1[nums1Index]) / 2.0;
                //不可能剩一个元素，上面的if条件会过滤掉
            }

            if (nums1[nums1Index] > nums2[nums2Index]) {
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
