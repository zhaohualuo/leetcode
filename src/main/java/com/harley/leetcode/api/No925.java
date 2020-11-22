package com.harley.leetcode.api;

/**
 * 925. 长按键入
 */
public class No925 {
    public static void main(String[] args) {
        No925 no925 = new No925();
        boolean longPressedName = no925.isLongPressedName("aab", "aaabbbaaaab");
        System.out.println(longPressedName);
    }

    public boolean isLongPressedName(String name, String typed) {
        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();
        int nameLen = nameChars.length;
        int typeLen = typedChars.length;
        if (nameChars[0] != typedChars[0] || nameChars[nameLen-1] != typedChars[typeLen-1]) {
            return  false;
        }

        int typeIndex = 0;
        for (int i = 0; i < nameLen; i++) {
            char c = nameChars[i];
            for (int j = typeIndex; j < typeLen; j++) {
                if (c == typedChars[j]) {
                    typeIndex = j+1;
                    break;
                }
                if (c != typedChars[j] && nameChars[i-1] != typedChars[j]) {
                    return false;
                }
            }
        }

        char last = nameChars[nameLen-1];
        for (int i = typeIndex; i < typeLen; i++) {
            if (last!=typedChars[i]) {
                return false;
            }
        }

        return true;
    }
}
