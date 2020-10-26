package com.harley.leetcode.api;

import java.util.ArrayList;
import java.util.List;

/**
 * 20. 有效的括号
 */
public class No20 {

    public static void main(String[] args) {
        No20 no20 = new No20();
        String s = "()";
        boolean valid = no20.isValid(s);
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        //注意空字符串可被认为是有效字符串。
        if("".equals(s)) {
            return true;
        }

        //stack 当一个栈使用
        List<Character> stack = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if('(' == c || '{' == c || '[' == c) {
                stack.add(c);
            } else if(')' == c || '}' == c || ']' == c){
                //此时栈里有可能一个左括号都没有，特殊情况
                if(stack.size() == 0) {
                    return false;
                }

                //右括号的话要匹配前一个是不是对应的左括号
                char left = stack.get(stack.size() - 1);
                if(')' == c) {
                    if('(' == left) {
                        //匹配成功，把 ( 出栈
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                } else if('}' == c) {
                    if('{' == left) {
                        //匹配成功，把 { 出栈
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                } else {
                    if('[' == left) {
                        //匹配成功，把 [ 出栈
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        //最后循环完，有可能剩下左括号
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}
