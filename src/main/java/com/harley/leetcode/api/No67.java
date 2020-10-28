package com.harley.leetcode.api;

/**
 * 67. 二进制求和
 */
public class No67 {

    public static void main(String[] args) {
        No67 no67 = new No67();
        String s = no67.addBinary("11", "0");
        System.out.println(s);
    }

    //二进制计算，逢二进一
    public String addBinary(String a, String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        //字符串最大长度
        int len = a.length() > b.length() ? a.length() : b.length();

        //寄存器，保存进位数
        int temp = 0;
        //存放新串
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len ; i++) {
            int tempA = lenA >= 0 ? (int)a.charAt(lenA) - 48 : 0;
            int tempB = lenB >= 0 ? (int)b.charAt(lenB) - 48: 0;

            if(tempA + tempB + temp >=2) {
                sb.append(tempA + tempB + temp - 2);
                temp = 1;
            } else {
                sb.append(tempA + tempB + temp);
                temp = 0;
            }

            lenA--;
            lenB--;
        }
        if (temp != 0) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
