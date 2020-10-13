package com.harley.leetcode.api;

public class No1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        //空酒瓶
        int emptyJiu = numBottles;
        int totalNums = numBottles;

        while(emptyJiu >= numExchange) {
            totalNums += emptyJiu / numExchange;
            emptyJiu = emptyJiu % numExchange + emptyJiu / numExchange;
        }
        return totalNums;
    }

    public static void main(String[] args) {
        No1518 no1518 = new No1518();
        int i = no1518.numWaterBottles(15, 4);
        System.out.println(i);
    }
}
