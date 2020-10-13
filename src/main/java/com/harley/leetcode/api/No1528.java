package com.harley.leetcode.api;

public class No1528 {

    public static void main(String[] args) {
        int[] arr= new int[]{4,5,6,7,0,2,1,3};

        String end = restoreString("codeleet",arr);
        System.out.println(end);
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i ++) {
            int index = indices[i];
            sb.append(s.charAt(index));
        }

        return sb.toString();
    }
}
