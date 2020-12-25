package com.harley.leetcode.interview;

/**
 * 面试题 10.05. 稀疏数组搜索
 *
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 *
 * words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 */
public class No1005 {
    public static void main(String[] args) {
        No1005 no1005 = new No1005();
        String[] words = {"DirNnILhARNS hOYIFB", "SM "};
        int ta = no1005.findString(words, "SM ");
        System.out.println(ta);
    }

    public int findString(String[] words, String s) {
        int left = 0;
        int right = words.length - 1;
        while (left <= right) {
            //记录每次进来的初始值
            int temp = (left + right) / 2;
            int mid = temp;

            //先处理特殊情况
            while (mid < right && "".equals(words[mid])) {
                mid++;
            }
            if (mid == right && s.compareTo(words[mid]) != 0) {
                //右半部分全是空串
                right = temp - 1;
                continue;
            }

            //比较大小
            if (s.compareTo(words[mid]) > 0) {
                left = mid + 1;
            } else if (s.compareTo(words[mid]) < 0){
                right = mid;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
