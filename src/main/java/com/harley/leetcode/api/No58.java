package com.harley.leetcode.api;

/**
 * 58. 最后一个单词的长度
 */
public class No58 {
    public static void main(String[] args) {
        No58 no58 = new No58();
        int hello_world = no58.lengthOfLastWord("Hello World");
        System.out.println(hello_world);
    }

    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        if(split.length == 0) {
            return 0;
        } else {
            return split[split.length-1].length();
        }
    }
}
