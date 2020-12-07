package com.harley.leetcode.api;

/**
 * 21. 合并两个有序链表
 */
public class No21 {
    public static void main(String[] args) {
        No21 no21 = new No21();
        ListNode listNode = new ListNode(1);
        ListNode temp1 = listNode;
        listNode.next = new ListNode(2);
        listNode = listNode.next;
        listNode.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        ListNode temp2 = listNode2;
        listNode2.next = new ListNode(3);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(4);
        ListNode listNode1 = no21.mergeTwoLists(temp1, temp2);
        System.out.println(listNode1);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode tempNode = listNode;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tempNode.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null){
                tempNode.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                if (l1.val <= l2.val) {
                    tempNode.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    tempNode.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            tempNode = tempNode.next;
        }
        return listNode.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
