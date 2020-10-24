package com.harley.leetcode.api;

/**
 * 13. 罗马数字转整数
 */
public class NO13 {
    public static void main(String[] args) {
        NO13 no13 = new NO13();
        int lviii = no13.romanToInt("LVIII");
        System.out.println(lviii);
    }

    /**
     * 只需要处理六种特殊情况就可以了，其他情况无脑加
     */
    public int romanToInt(String s) {
        //下标 = 长度-1
        int len = s.length() - 1;
        //最终结果
        int sum = 0;
        while(len >= 0) {
            //每次匹配成功后要把匹配完的，后面的字母删掉

            //每次匹配到的临时变量
            int temp = 0;
            switch(s.charAt(len)) {
                case 'I' : temp = 1; len--; break;
                case 'V' :
                    //这里进行了len--，所以下面都是指的前一个元素
                    len--;
                    temp = 5;
                    if(len == -1) {
                        //已经是第一个了，不能再判断前一个了
                        break;
                    } else if('I' == s.charAt(len)) {
                        len--;
                        temp = 4;
                    }
                    break;
                case 'X' :
                    len--;
                    temp = 10;
                    if(len == -1) {
                        break;
                    } else if('I' == s.charAt(len)) {
                        len--;
                        temp = 9;
                    }
                    break;
                case 'L' :
                    len--;
                    temp = 50;
                    if(len == -1) {
                        break;
                    } else if('X' == s.charAt(len)) {
                        len--;
                        temp = 40;
                    }
                    break;
                case 'C' :
                    len--;
                    temp = 100;
                    if(len == -1) {
                        break;
                    } else if('X' == s.charAt(len)) {
                        len--;
                        temp = 90;
                    }
                    break;
                case 'D' :
                    len--;
                    temp = 500;
                    if(len == -1) {
                        break;
                    } else if('C' == s.charAt(len)) {
                        len--;
                        temp = 400;
                    }
                    break;
                case 'M' :
                    len--;
                    temp = 1000;
                    if(len == -1) {
                        break;
                    } else if('C' == s.charAt(len)) {
                        len--;
                        temp = 900;
                    }
                    break;
                default:break;
            }
            sum += temp;
        }
        return sum;
    }
}
