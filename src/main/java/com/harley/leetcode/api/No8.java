package com.harley.leetcode.api;

/**
 * 8. 字符串转换整数 (atoi)
 * <p>
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * <p>
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
 * <p>
 * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
 * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
 * <p>
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
 * <p>
 * 提示：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 */
public class No8 {
    public static void main(String[] args) {
        No8 no8 = new No8();
        int i = no8.myAtoi("2147483648");
        System.out.println(i);
    }

    public int myAtoi(String s) {
        //去除开头结尾空格
        String trim = s.trim();

        //Ascii 0=48  9=57
        char[] chars = trim.toCharArray();
        char first = '-';
        if (chars.length > 0) {
            first = chars[0];
        }
        char second = '-';
        if (chars.length > 1) {
            second = chars[1];
        }

        //判断是否有+++---12这种情况
        if (isInt(first)) {
            return trans('+', 0, chars);
        } else if (first == '+' && isInt(second)) {
            return trans('+', 1, chars);
        } else if (first == '-' && isInt(second)) {
            return trans('-', 1, chars);
        } else {
            return 0;
        }
    }

    /**
     * String转化为int
     *
     * @param fuhao 符号位 +/-
     * @param index 数组下标（初次是第一个数字的下标）
     * @param chars 数组
     * @return 转化后的数字
     */
    private int trans(char fuhao, int index, char[] chars) {
        int result;
        if (isInt(chars[index])) {
            result = chars[index] - 48;
        } else {
            return 0;
        }

        if ((index + 1) >= chars.length) {
            return fuhao == '-' ? -result : result;
        }

        index++;
        while (isInt(chars[index])) {
            //每次都要判断当前是否已经超出了整数范围，不能超过 32 位有符号整数范围
            int fuhaoInt = fuhao == '-' ? -result : result;
            if (fuhaoInt > Integer.MAX_VALUE / 10 || (fuhaoInt == Integer.MAX_VALUE / 10 && (chars[index] - 48) > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            } else if (fuhaoInt < Integer.MIN_VALUE / 10 || (fuhaoInt == Integer.MIN_VALUE / 10 && (chars[index] - 48) > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            result = result * 10 + chars[index] - 48;
            index++;

            if (index >= chars.length) {
                break;
            }
        }

        return fuhao == '-' ? -result : result;
    }

    /**
     * 判断一个char类型的字符是否是数字
     *
     * @param temp 要判断的字符
     * @return 判断结果
     */
    private boolean isInt(char temp) {
        return temp >= 48 && temp <= 57;
    }
}
