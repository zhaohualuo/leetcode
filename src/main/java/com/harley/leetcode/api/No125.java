package com.harley.leetcode.api;

/**
 * 125. 验证回文串
 */
public class No125 {

    public static void main(String[] args) {
        No125 no125 = new No125();
        boolean palindrome = no125.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }

    public boolean isPalindrome(String s) {
        if(s.length() <=1) {
            return true;
        }

        //只考虑字母和数字，过滤其他字符
        //ascii码
        //0-9: 48 - 57
        //a-z:97-122
        //A-Z:65-90
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < s.length() ; i++) {
            int temp = s.charAt(i);
            if(temp >= 48 && temp <= 57) {
                newStr.append((char)temp);
            }
            if(temp >= 97 && temp <= 122) {
                newStr.append((char)temp);
            }
            if(temp >= 65 && temp <= 90) {
                //大写转小写，统一格式
                newStr.append((char)(temp+32));
            }
        }

        String str = newStr.toString();
        int len = str.length();
        for(int i = 0; i <=len/2 ; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }
}
