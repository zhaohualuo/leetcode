package com.harley.leetcode.api;

import java.util.*;

/**
 * 1636. 按照频率将数组升序排序
 * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
 */
public class No1636 {
    public static void main(String[] args) {
        No1636 no1636 = new No1636();
        int[] nums = {1,1,2,2,2,3};
        int[] ints = no1636.frequencySort(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public int[] frequencySort(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //用map统计出每个字出现的频率
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            if (map.containsKey(nums[i])) {
                map.put(nums[i],1 + map.get(nums[i]));
            } else {
                map.put(nums[i],1);
            }
        }

        //根据value的值排序
        list.sort((x,y) -> {
            int x1 = map.get(x);
            int y1 = map.get(y);
            if (x1 == y1) {
                //频率相同
                return y - x;
            }
            return x1 - y1;
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
