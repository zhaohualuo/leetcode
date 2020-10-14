package com.harley.leetcode.api;

import java.util.HashMap;
import java.util.Map;

public class No58 {
    public static void main(String[] args) {
        String test = "12345678";
        //截取下标为 0 和 1
        System.out.println(test.substring(0,2));
        //截取下标为 2及2之后的字符
        System.out.println(test.substring(2));

        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        Integer b = map.get("b") + 1;
        System.out.print(b);
    }
}
