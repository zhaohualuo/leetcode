package com.harley.leetcode.api;

/**
 * 74. 搜索二维矩阵
 */
public class No74 {
    public static void main(String[] args) {
        int[][] matrix = {{3}};
        boolean b = searchMatrix(matrix, 3);
        System.out.println(b);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        //特殊情况会越界
        if (matrix.length == 0) {
            return false;
        }

        //行数
        int rows = matrix.length;
        //通过二分法判断数据在哪一行
        int top = 0;
        int bottom = rows-1;
        for (int i = 0; i < rows; i++) {
            //判断越界情况,越界了还没找到
            if (top > bottom) {
                return false;
            }

            int mid = (top + bottom) / 2;
            int leftValue = matrix[mid][0];
            int rightValue = matrix[mid][matrix[mid].length-1];
            if (target < leftValue) {
                //答案在mid行的前面
                bottom = mid-1;
            } else if (target <= rightValue){
                //答案就是mid这一行
                top = mid;
                break;
            } else {
                top = mid+1;
            }

            //防止for循环跳出导致的越界
            if (top == rows) {
                top--;
            }
        }

        //top行有多少元素
        int cols = matrix[top].length;
        //通过二分法判断数据在这一行的哪个位置
        int left = 0;
        int right = cols - 1;
        for (int i = 0; i < cols; i++) {
            //判断越界情况,越界了还没找到
            if (left > right) {
                return false;
            }

            int mid = (left + right) / 2;
            int value = matrix[top][mid];
            if (target > value) {
                left = mid + 1;
            } else if (target < value) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        //有可能时因为for循环的边界值跳出来的，这种情况需要是false
        return false;
    }
}
