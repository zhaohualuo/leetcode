package com.harley.leetcode.api;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 350. 两个数组的交集 II
 */
public class No350 {
    public static void main(String[] args) {
        No350 no350 = new No350();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] intersect = no350.intersect(nums1, nums2);
        System.out.println(intersect.length);
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        //存在这种情况就是故意浪费我一次提交
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Arrays.sort(nums1);

        //每次都拿第一个数组的某个数字去第二个数组匹配，每次匹配成功后再List中移除
        List<Integer> list = new ArrayList<>();
        List<Integer> num2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        for (int i = 0; i < nums1.length; i++) {
            if (num2List.contains(nums1[i])) {
                list.add(nums1[i]);
                num2List.remove((Integer) nums1[i]);
            }
        }

        return list.stream().mapToInt(Number::intValue).toArray();
    }

}
