package com.harley.leetcode.api;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class No606 {

    public static void main(String[] args) {
        No606 no606 = new No606();
        TreeNode t = new TreeNode(1);
        String s = no606.tree2str(t);
        System.out.println(s);
    }

    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        sonTree(t,sb);
        return sb.toString();
    }

    public void sonTree(TreeNode t, StringBuilder sb) {
        if(t != null) {
            sb.append(t.val);
            if(t.left != null || t.right != null) {
                sb.append("(");
                sonTree(t,sb);
                sb.append(")");

                if(t.right != null) {
                    sb.append("(");
                    sonTree(t,sb);
                    sb.append(")");
                }
            }

        }
    }

    /**
     * 静态内部类
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
