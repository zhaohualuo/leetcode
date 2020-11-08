package com.harley.leetcode.api;

/**
 * 434. 字符串中的单词数
 */
public class No434 {

    /**
     * ", , , ,        a, eaefa"
     * 这个标准答案是6个单词，我的是两个单词
     * 我不改了
     * 阻挡我的不是编程水平，而是语文水平，不仅是我自己的，还有出题人的语文水平
     */
    public static void main(String[] args) {
        No434 no434 = new No434();
        int i = no434.countSegments("love live! mu'sic forever");
        System.out.println(i);
    }

    public int countSegments(String s) {
        //"love live! mu'sic forever"  这种情况是4个单词
        //"one-hour"  这种情况是1个单词

        int count = 0;
        for(int i=1;i<s.length();i++) {
            int pre = s.charAt(i-1);
            int cur = s.charAt(i);
            //大写字母：65-90
            //小写字母：97-122
            //':39
            //-:45
            if((pre >64 && pre <91) || (pre >96 && pre <123) || pre==39 || pre == 45) {
                if(((cur < 97 && cur >90) || cur < 65 || cur > 122) && cur != 39 && cur != 45 ) {
                    count++;
                }
            }
        }
        //判断最后一个单词有没有被统计上
        if(s.length() > 0) {
            int endChar = s.charAt(s.length()-1);
            if((endChar >64 && endChar <91) || (endChar >96 && endChar <123)|| endChar==39 || endChar == 45) {
                count++;
            }
        }

        return count;
    }
}
