package com.harley.leetcode.api;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * 657. 机器人能否返回原点
 */
public class No657 {
    public static void main(String[] args) {
        No657 no657 = new No657();
        boolean ud = no657.judgeCircle("UD");
        System.out.println(ud);
    }

    public boolean judgeCircle(String moves) {
        int top = 0;
        int left = 0;

        for (int i = 0; i < moves.length(); i++) {
            String move = String.valueOf(moves.charAt(i));
            switch (move) {
                case "U":top++;break;
                case "D":top--;break;
                case "L":left++;break;
                case "R":left--;break;
                default:break;
            }
        }

        return top == 0 && left == 0;

    }
}
