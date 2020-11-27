package com.harley.leetcode.api;

import java.util.Arrays;

/**
 * 1491. 去掉最低工资和最高工资后的工资平均值
 */
public class No1491 {
    public static void main(String[] args) {
        No1491 no1491 = new No1491();
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double average = no1491.average(salary);
        System.out.println(average);
    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length-1; i++) {
            sum += salary[i];
        }
        return sum/(salary.length-2);
    }
}
