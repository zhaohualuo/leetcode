package com.harley.leetcode.api;

/**
 * 14. 最长公共前缀
 */
public class No14 {

    public static void main(String[] args) {
        No14 no14 = new No14();
        String[] strs = {"ab", "a"};
        String s = no14.longestCommonPrefix(strs);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        //在提交报错后添加的这两种特殊情况
        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }

        //存储所有字符串的最小长度
        int len = strs[0].length();
        for(int j=1;j <strs.length;j++){
            len = len > strs[j].length() ? strs[j].length() : len;
        }

        for(int i=0;i< len ;i++) {
            char temp = strs[0].charAt(i);
            for(int j=1;j <strs.length;j++){
                if(temp != strs[j].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }

            if(i == len-1) {
                //全部匹配完了
                return strs[0].substring(0,len);
            }
        }

        return "";
    }
}
