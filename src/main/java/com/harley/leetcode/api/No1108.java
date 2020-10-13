package com.harley.leetcode.api;

public class No1108 {

    public static void main(String[] args) {
        String s = defangIPaddr("1.1.1.1");
        System.out.println(s);
    }

    public static String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(String str: split) {
            sb.append(str).append("[.]");
        }
        String end = sb.toString();
        return end.substring(0,end.length()-3);
    }

    public static String defangIPaddr2(String address) {
        return address.replace(".","[.]");
    }
}
