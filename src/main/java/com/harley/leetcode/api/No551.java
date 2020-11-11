package com.harley.leetcode.api;

/**
 * 551. 学生出勤记录 I
 */
public class No551 {
    public static void main(String[] args) {
        No551 no551 = new No551();
        boolean ppallp = no551.checkRecord("LLLL");
        System.out.println(ppallp);
    }

    public boolean checkRecord(String s) {
        //判断是否超过一个A
        int a = s.indexOf("A");
        if (a >= 0) {
            int a1 = s.indexOf("A", a + 1);
            if (a1 > 0) {
                return  false;
            }
        }

        int ll = s.indexOf("LLL");
        if (ll >= 0) {
            return  false;
        }

        return  true;
    }
}
