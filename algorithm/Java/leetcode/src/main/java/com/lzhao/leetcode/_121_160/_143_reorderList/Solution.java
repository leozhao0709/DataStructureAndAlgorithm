package com.lzhao.leetcode._121_160._143_reorderList;

/**
 * Created by lzhao on 8/29/17.
 */

class Solution {
    void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (slow.next != null && fast.next!= null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // here we can find the middle node (odd is slow node, even is slow.next node), here we need to reverse the node from slow.next
        ListNode reverseHead = this.reverseList(slow.next);

        // after reverse, we can start merge 2 list
        ListNode p = head;
        ListNode q = reverseHead;

        while (q != null) {
            ListNode pTemp = p.next;
            ListNode qTemp = q.next;
            p.next = q;
            q.next = pTemp;
            p = pTemp;
            q = qTemp;
        }

        if (p != null) {
            p.next = null;
        }

    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        head.next = null;

        return p1;
    }
}
