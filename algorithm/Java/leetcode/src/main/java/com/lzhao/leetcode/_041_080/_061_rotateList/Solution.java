package com.lzhao.leetcode._041_080._061_rotateList;

/**
 * Created by lzhao on 8/15/17.
 */

class Solution {

    ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;

        ListNode p = head;
        while (p.next != null) {
            p = p.next;
            len++;
        }

        k%=len;

        if (k == 0) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int rotateIndex = len - k;

        ListNode q = dummy;
        int i = 0;

        while (i < rotateIndex) {
            q = q.next;
            i++;
        }

        dummy.next = new ListNode(q.next.val);
        q.next = p.next;
        p.next = head;

        return dummy.next;
    }
}
