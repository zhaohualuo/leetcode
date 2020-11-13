package com.harley.leetcode.api;

/**
 * 680. 验证回文字符串 Ⅱ
 */
public class No680 {
    public static void main(String[] args) {
        No680 no680 = new No680();
        boolean flag = no680.validPalindrome("abc");
        System.out.println(flag);
    }

    public boolean validPalindrome(String s) {
        //前置下标
        int start = 0;
        //后置下标
        int end = s.length() - 1;
        //删除次数
        int del = 1;
        //最终结果
        boolean flag = true;

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(start) != s.charAt(end)){
                if (del > 0) {
                    del--;
                    if (s.charAt(start +1) == s.charAt(end)) {
                        start++;
                    }else if (s.charAt(start) == s.charAt(end-1)) {
                        end--;
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            start++;
            end--;
        }

        //有一种特殊情况，删除前面的也能对上，删除后面的也能对上
        //重新跑一遍，删除后面的
        if (!flag) {
            start = 0;
            end = s.length() - 1;
            del = 1;
            flag = true;
            for (int i = 0; i < s.length()/2; i++) {
                if (s.charAt(start) != s.charAt(end)){
                    if (del > 0) {
                        del--;
                        if (s.charAt(start) == s.charAt(end-1)) {
                            end--;
                        }else if (s.charAt(start+1) == s.charAt(end)) {
                            start++;
                        } else {
                            flag = false;
                            break;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                }
                start++;
                end--;
            }
        }

        return flag;
    }
}
