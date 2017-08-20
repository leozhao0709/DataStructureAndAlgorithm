package com.lzhao.leetcode._081_120._083_removeDuplicatesFromSortedList;

/**
 * Created by lzhao on 8/19/17.
 */

class Solution {

    ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p = head;
        ListNode q = head.next;

        while (q != null) {
            if (p.val == q.val) {
                if (q.next != null) {
                    p.next = q.next;
                } else {
                    p.next = null;
                }
                q = q.next;
            } else {
                p = p.next;
                q = q.next;
            }
        }

        return dummy.next;
    }

}
