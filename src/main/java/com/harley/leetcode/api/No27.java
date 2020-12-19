package com.harley.leetcode.api;

/**
 * 27. 移除元素
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class No27 {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        No27 no27 = new No27();
        int i = no27.removeElement(arr, 3);
        System.out.println(i);
    }

    public int removeElement(int[] nums, int val) {
        //倒数计数
        int lastIndex = nums.length-1;
        //记录符合条件元素总数
        int count = 0;

        //冒泡排序，把不符合条件的冒泡到最后
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = lastIndex; j > i ; j--) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        lastIndex = j;
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
