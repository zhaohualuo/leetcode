package com.harley.leetcode.api;

public class No1021 {
    public static void main(String[] args) {
        String input = "(()())(())";
        String s = removeOuterParentheses(input);
        System.out.println(s);
    }

    public static String removeOuterParentheses(String S) {
        //init放最外层左括号
        char init = 'a';
        //左括号数量
        int left = 0;
        //右括号数量
        int right = 0;
        //查括号的数量（除init外），当右括号数量和左括号数量相等时

        //最外 右括号的下标
        int index = -1;

        StringBuilder end = new StringBuilder();
        for(int i = 0;i < S.length();i++) {
            if((index == i) && (')' == S.charAt(i))) {
                //最外层右括号,不记录在结果集；左括号存根
                init = 'a';
                continue;
            }

            if('a'==init) {
                //init里面没有(,需要放置一个左括号作为最外层(
                init = S.charAt(i);
            } else {
                //init里面有(,需要计算 左括号和右括号的数量
                if('(' == S.charAt(i)) {
                    left++;
                }
                if(')' == S.charAt(i)){
                    right++;
                }

                //左括号的数量=右括号的数量
                if(left == right) {
                    index = i + 1;
                }
                end.append(S.charAt(i));
            }
        }
        return end.toString();
    }
}
