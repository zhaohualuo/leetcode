package com.harley.leetcode.api;

/**
 * 788. 旋转数字
 */
public class No788 {
    public static void main(String[] args) {
        No788 no788 = new No788();
        int i = no788.rotatedDigits(857);
        System.out.println(i);
    }

    /**
     * 0 1 2 5 6 8 9旋转后为有效数字
     * 3 4 7 无效。所以只要含有 3 4 7 其中一个，必无效
     * 至少包含一位 2 5 6 9
     */
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 0; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.contains("3") || s.contains("4") || s.contains("7")) {

            } else {
                if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
                    count++;
                }
            }
        }

        return count;
    }
}
