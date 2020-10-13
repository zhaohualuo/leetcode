package com.harley.leetcode.api;

public class No771 {

    public static void main(String[] args) {
        int i = numJewelsInStones("aA", "aAAbbbb");
        System.out.println(i);
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i = 0; i < J.length(); i++){
            char tempChar = J.charAt(i);
            int tempCount = 0;
            int tempIndex = 0;
            int i1 = S.indexOf(tempChar,tempIndex);

            while((tempIndex = S.indexOf(tempChar,tempIndex)) >= 0) {
                tempCount ++;
                tempIndex++;
            }
            count += tempCount;
        }
        return count;
    }
}
