package com.lzhao.leetcode._121_160._147_insertionSortList;

/**
 * Created by lzhao on 8/29/17.
 */

class Solution {

    ListNode insertionSortList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {
            ListNode temp = p2.next;

            ListNode q1 = dummy;
            ListNode q2 = dummy.next;

            while (q2 != p2) {
                if (p2.val > q2.val) {
                    q2 = q2.next;
                    q1 = q1.next;
                } else {
                    q1.next = p2;
                    p2.next = q2;
                    break;
                }
            }

            if (q2 == p2) {
                p1 = p2;
            }

            p2 = temp;
            p1.next = temp;
        }

        return dummy.next;
    }
}
