package com.harley.leetcode.api;

/**
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 个人感觉重点有两个：1、最大利润   2、尽可能地完成更多的交易
 * 本题考点是：若今天买了，明天能赚钱就卖。这样能满足条件2
 * 不用考虑什么策略赚钱最多，考虑的话    就满足不了条件2了
 */
public class No122 {

    public int maxProfit(int[] prices) {
        int num = 0;
        for(int i = 0 ; i < prices.length-1 ; i ++ ){
            if(prices[i] <= prices[i+1]) {
                num += prices[i+1] - prices[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        No122 no122 = new No122();
        int[] input = new int[]{7,1,5,3,6,4};
        int i = no122.maxProfit(input);
        System.out.println(i);
    }
}
