package com.lzhao.leetcode._001_040._002_AddTwoNumbers;

/**
 * Created by lzhao on 6/21/17.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int current = l1.val + l2.val;
        int c = 0;

        ListNode result;
        if (current > 9) {
            result = new ListNode(current - 10);
            c = 1;
        } else {
            result = new ListNode(current);
        }

        ListNode p = result;


        ListNode p1 = l1.next;
        ListNode p2 = l2.next;

        while (p1 != null || p2 != null) {
            int val1 = p1 == null? 0: p1.val;
            int val2 = p2 == null? 0: p2.val;

            current = val1 + val2 + c;
            
            if (current > 9) {
                c = 1;
                p.next = new ListNode(current - 10);
            } else {
                c = 0;
                p.next = new ListNode(current);
            }

            p = p.next;
            p1 = p1 == null? null: p1.next;
            p2 = p2 == null? null: p2.next;
        }

        if (c != 0) {
            p.next = new ListNode(c);
        }

        return result;
    }
}

