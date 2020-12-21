package com.harley.leetcode.api;

/**
 * 5. 最长回文子串
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class No5 {
    public static void main(String[] args) {
        No5 no5 = new No5();
        String babab = no5.longestPalindrome("a");
        System.out.println(babab);
    }

    public String longestPalindrome(String s) {
        //记录最大的回文串及其长度(max = s是为了防止s只有一个字符时，进不去下面的for循环)
        String max = s;
        int maxInt = 0;

        //寻找每个字符的回文串
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            //特殊情况1：回文数是奇数个字符，最中间是一个单独字符
            String s1 = trans2(i, i, chars);
            if (maxInt < s1.length()) {
                max = s1;
                maxInt = s1.length();
            }

            //特殊情况2，回文数是偶数个字符，中间是两个相同字符
            if (chars[i] == chars[i + 1]) {
                String s2 = trans2(i, i + 1, chars);
                if (maxInt < s2.length()) {
                    max = s2;
                    maxInt = s2.length();
                }
            }
        }

        return max;
    }

    private String trans2(int left, int right, char[] arr) {
        while (left >=0 && right <= arr.length-1) {
            if (arr[left] != arr[right]) {
                //不再是回文数了
                break;
            }
            left--;
            right++;
        }
        //这一步已经不再是回文数了，状态回归到上一步,我们需要的是回文数
        left++;
        right--;

        //已经越界了，不符合条件了，left到right之间是回文数
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = left; i <= right; i++) {
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }


}
