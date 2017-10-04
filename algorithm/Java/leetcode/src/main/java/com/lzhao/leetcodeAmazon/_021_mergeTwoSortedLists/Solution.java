package com.lzhao.leetcodeAmazon._021_mergeTwoSortedLists;

/**
 * Created by lzhao on 10/2/17.
 */

class Solution {

    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        ListNode p = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        while (p1 != null) {
            p.next = p1;
            p1 = p1.next;
            p = p.next;
        }

        while (p2 != null) {
            p.next = p2;
            p2 = p2.next;
            p = p.next;
        }

        return dummy.next;
    }
}
