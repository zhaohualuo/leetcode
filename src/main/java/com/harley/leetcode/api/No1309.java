package com.harley.leetcode.api;

/**
 * 1309. 解码字母到整数映射
 */
public class No1309 {
    public static void main(String[] args) {
        No1309 no1309 = new No1309();
        String s = no1309.freqAlphabets("1326#");
        System.out.println(s);
    }


    public String freqAlphabets(String s) {
        //Ascii码 a是97;例题中a=1；差值96
        StringBuilder endStr = new StringBuilder();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i+2 < len){
                if (s.charAt(i+2) == '#') {
                    int temp = Integer.parseInt(s.substring(i, i + 2));
                    endStr.append((char) (temp + 96));
                    i+=2;
                } else {
                    endStr.append((char) (Integer.parseInt(s.charAt(i) + "") + 96));
                }
            } else {
                endStr.append((char) (Integer.parseInt(s.charAt(i) + "") + 96));
            }
        }
        return endStr.toString();
    }
}
