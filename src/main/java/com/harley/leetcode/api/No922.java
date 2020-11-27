package com.harley.leetcode.api;

/**
 * 922. 按奇偶排序数组 II
 */
public class No922 {
    public static void main(String[] args) {
        No922 no922 = new No922();
        int[] A = {4,2,5,7};
        int[] ints = no922.sortArrayByParityII(A);
        System.out.println(ints.toString());
    }

    //思路，当前奇数偶数不匹配时，去找后面的借
    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (i % 2 != 0) {
                //奇数
                if (A[i] %2 == 0) {
                    for (int j = i+1; j < A.length; j++) {
                        if (A[j] % 2 != 0) {
                            int temp = A[i];
                            A[i] = A[j];
                            A[j] = temp;
                            break;
                        }
                    }
                }
            } else {
                //偶数
                if (A[i] %2 != 0) {
                    for (int j = i+1; j < A.length; j++) {
                        if (A[j] % 2 == 0) {
                            int temp = A[i];
                            A[i] = A[j];
                            A[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
        return A;
    }
}
