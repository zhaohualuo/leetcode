package com.harley.leetcode.api;

public class No455 {
    public int findContentChildren(int[] g, int[] s) {
        //主要是我也不知道默认给的两个数组是不是从小到大排序的
        //假设是无序的，首先应排序
        //每次循环把最小的放在最前面
        for(int i = 0; i < g.length ; i++) {
            for(int j = i+1; j < g.length ; j++) {
                if(g[i] > g[j]){
                    int temp = g[i];
                    g[i] = g[j];
                    g[j] = temp;
                }
            }
        }

        for(int i = 0; i < s.length ; i++) {
            for(int j = i+1; j < s.length ; j++) {
                if(s[i] > s[j]){
                    int temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        //下一步应分配哪块饼干
        int index = 0;
        //有几个小孩分配成功
        int count = 0;
        for(int i = 0; i < g.length ; i++) {
            for(int j = index; j < s.length ; j++) {
                if(g[i] <= s[j]) {
                    index = ++j;
                    count++;
                    break;
                }

                //饼干分完了，剩下的小孩不用等了
                if(j == s.length-1) {
                    return count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        No455 no455 = new No455();
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
        int contentChildren = no455.findContentChildren(g, s);
        System.out.println(contentChildren);
    }
}
