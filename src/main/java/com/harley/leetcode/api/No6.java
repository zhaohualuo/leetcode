package com.harley.leetcode.api;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Z 字形变换
 */
public class No6 {
    public static void main(String[] args) {
        No6 no6 = new No6();
        String leetcodeishiring = no6.convert("LEETCODEISHIRING", 3);
        System.out.println(leetcodeishiring);
    }

    public String convert(String s, int numRows) {
        //特殊情况处理
        if (numRows < 2) {
            return s;
        }

        int minNum = Math.min(s.length(), numRows);
        List<StringBuilder> list = new ArrayList<>();

        //创建minNum个StringBuilder
        for (int i = 0; i < minNum; i++) {
            list.add(new StringBuilder());
        }

        //行号
        int rowsNum = 0;
        //每次对行号的增减
        int step = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            list.get(rowsNum).append(chars[i]);
            //判断边界值,到达边界值时改变方向
            if (rowsNum == 0 || rowsNum == numRows-1) {
                step = - step;
            }
            rowsNum += step;
        }

        //所有的StringBulder按照下标顺序组成一个StringBuilder
        StringBuilder end = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            end.append(list.get(i));
        }
        return end.toString();
    }
}
