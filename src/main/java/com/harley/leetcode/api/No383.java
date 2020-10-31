package com.harley.leetcode.api;

/**
 * 383. 赎金信
 */
public class No383 {
    public static void main(String[] args) {
        No383 no383 = new No383();
        boolean b = no383.canConstruct("aa", "ab");
        System.out.println(b);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0; i<ransomNote.length(); i++) {
            //替换前的原串
            String old = magazine;
            //替换后返回的新串
            magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)),"-");
            if(old.equals(magazine)) {
                return false;
            }
        }
        return true;
    }
}
