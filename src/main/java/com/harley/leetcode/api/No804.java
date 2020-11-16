package com.harley.leetcode.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词
 */
public class No804 {
    private static Map<Character,String> femsMap;
    static {
        femsMap = new HashMap<>();
        femsMap.put('a',".-");
        femsMap.put('b',"-...");
        femsMap.put('c',"-.-.");
        femsMap.put('d',"-..");
        femsMap.put('e',".");
        femsMap.put('f',"..-.");
        femsMap.put('g',"--.");
        femsMap.put('h',"....");
        femsMap.put('i',"..");
        femsMap.put('j',".---");
        femsMap.put('k',"-.-");
        femsMap.put('l',".-..");
        femsMap.put('m',"--");
        femsMap.put('n',"-.");
        femsMap.put('o',"---");
        femsMap.put('p',".--.");
        femsMap.put('q',"--.-");
        femsMap.put('r',".-.");
        femsMap.put('s',"...");
        femsMap.put('t',"-");
        femsMap.put('u',"..-");
        femsMap.put('v',"...-");
        femsMap.put('w',".--");
        femsMap.put('x',"-..-");
        femsMap.put('y',"-.--");
        femsMap.put('z',"--..");
    }

    public static void main(String[] args) {
        No804 no804 = new No804();
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        int i = no804.uniqueMorseRepresentations(words);
        System.out.println(i);
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                stringBuilder.append(femsMap.get(word.charAt(i)));
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }



}
