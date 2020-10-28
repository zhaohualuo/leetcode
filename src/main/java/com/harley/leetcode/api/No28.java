package com.harley.leetcode.api;

/**
 * 28. 实现 strStr()
 */
public class No28 {
    public static void main(String[] args) {
        No28 no28 = new No28();
        int i = no28.strStr("hello", "ll");
        System.out.println(i);

        //如果 查询是否包含一个空川，怎么处理
        boolean contains = "aaa".contains("");
        System.out.println("contains:" + contains);
//        会报空指针异常
//        boolean contains2 = "aaa".contains(null);
//        System.out.println("contains2:" + contains2);

        int i1 = "bbb".indexOf("");
        int i2 = "bbb".indexOf("5");
        System.out.println("i1:" + i1);
        System.out.println("i2:" + i2);
    }

    public int strStr(String haystack, String needle) {
        //先处理特殊情况
        if (needle == null || "".equals(needle)) {
            return 0;
        }

        if (haystack.contains(needle)) {
            //确定包含了，然后取下标
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
