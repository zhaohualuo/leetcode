package com.harley.leetcode.api;

public class No415 {
    public static void main(String[] args) {
        No415 no415 = new No415();
        String s = no415.addStrings("10", "110");
        System.out.println(s);
    }

    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int i = 1;
        int jin = 0;

        StringBuilder sb = new StringBuilder();
        while(i <= len2 || i <= len1){
            String numA = "0";
            if(i <= len1) {
                numA = String.valueOf(num1.charAt(len1 - i));
            }
            String numB = "0";
            if(i <= len2) {
                numB = String.valueOf(num2.charAt(len2 - i));
            }
            int tempNum = Integer.parseInt(numA) + Integer.parseInt(numB) + jin;
            if(tempNum >= 10) {
                jin = 1;
                sb.append(tempNum - 10);
            } else{
                jin = 0;
                sb.append(tempNum);
            }
            i++;
        }
        return sb.reverse().toString();
    }
}
