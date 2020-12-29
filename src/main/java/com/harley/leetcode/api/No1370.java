package com.harley.leetcode.api;

/**
 * 1370. 上升下降字符串
 */
public class No1370 {

    public String sortString(String s) {
        //26个字符
        int[] count = new int[26];

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            count[aChar - 'a']++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() != s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    stringBuilder.append((char) (i + 'a'));
                    count[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] != 0) {
                    stringBuilder.append((char) (i + 'a'));
                    count[i]--;
                }
            }
        }

        return stringBuilder.toString();
    }
}
