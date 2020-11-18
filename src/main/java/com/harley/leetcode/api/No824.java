package com.harley.leetcode.api;

/**
 * 824. 山羊拉丁文
 */
public class No824 {
    public static void main(String[] args) {
        No824 no824 = new No824();
        String i_speak_goat_latin = no824.toGoatLatin("I speak Goat Latin");
        System.out.println(i_speak_goat_latin);
    }

    public String toGoatLatin(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = S.split(" ");
        StringBuilder aCount = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            aCount.append("a");
            String word = words[i];
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i")
                    || word.startsWith("o") || word.startsWith("u") || word.startsWith("A")
                    || word.startsWith("E") || word.startsWith("I")
                    || word.startsWith("O") || word.startsWith("U")) {
                stringBuilder.append(word);
            } else {
                stringBuilder.append(word.substring(1)).append(word.charAt(0));
            }

            stringBuilder.append("ma").append(aCount).append(" ");
        }
        String end = stringBuilder.toString();
        return end.substring(0,end.length()-1);
    }
}
