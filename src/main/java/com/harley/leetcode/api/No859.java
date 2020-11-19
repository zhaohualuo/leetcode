package com.harley.leetcode.api;

/**
 * 859. 亲密字符串
 */
public class No859 {
    public static void main(String[] args) {
        No859 no859 = new No859();
        boolean b = no859.buddyStrings("abcd", "badc");
        System.out.println(b);
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int len = A.length();

        char tempA = 0;
        char tempB = 0;
        int flag = 0;
        for (int i = 0; i < len; i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (tempA == 0) {
                    tempA = A.charAt(i);
                    tempB = B.charAt(i);
                } else {
                    if (tempA == B.charAt(i) && tempB == A.charAt(i)) {
                        //成功替换了一次
                        tempA = 0;
                        tempB = 0;
                        flag++;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (tempA != 0) {
            return false;
        }

        //初步成功了，需进一步判断aa aa的情况
        if (flag == 0) {
            for (int i = 0; i < len; i++) {
                if (A.indexOf(A.charAt(i),i+1) > 0) {
                    return true;
                }
            }
            return false;
        }

        return flag==1;
    }
}
