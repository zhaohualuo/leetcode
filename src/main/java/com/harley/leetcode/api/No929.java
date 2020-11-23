package com.harley.leetcode.api;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. 独特的电子邮件地址
 */
public class No929 {
    public static void main(String[] args) {
        No929 no929 = new No929();
        String[] emails = {"test.emailalex@leetcode.com","test.e.mailbob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int i = no929.numUniqueEmails(emails);
        System.out.println(i);
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            if (email.contains("@")) {
                String[] split1 = email.split("@");

                String pre = split1[0];
                if (pre.contains("+")) {
                    set.add(pre.split("\\+")[0].replaceAll("\\.", "") + "@" + split1[1]);
                } else if (pre.contains(".")) {
                    set.add(pre.replaceAll("\\.", "") + "@" + split1[1]);
                } else {
                    set.add(email);
                }
            }

        }


        return set.size();
    }
}
