package com.harley.leetcode.api;

import java.util.*;

/**
 * 1. 两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 */
public class No1 {
    public static void main(String[] args) {
        No1 no1 = new No1();
        int[] nums = {-3,4,3,90};
        int[] ints = no1.twoSum(nums, 0);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        //数组转map
        Map<Integer,String> map = new HashMap<>();
        for (int i=0; i< nums.length ;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + "#" + i);
            } else {
                map.put(nums[i],String.valueOf(i));
            }
        }

        //遍历map
        int[] end = new int[2];
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String[] value = entry.getValue().split("#");

            if (map.containsKey(target - key)) {
                if (target - key == key) {
                    //主要是为了匹配特殊情况
                    if (value.length > 1 ) {
                        //匹配成功
                        end[0] = Integer.parseInt(value[0]);
                        end[1] = Integer.parseInt(value[1]);
                        break;
                    }
                }

                //匹配成功
                end[0] = Integer.parseInt(value[0]);
                end[1] = Integer.parseInt(map.get(target - key).split("#")[0]);
            }
        }

        return end;
    }
}
