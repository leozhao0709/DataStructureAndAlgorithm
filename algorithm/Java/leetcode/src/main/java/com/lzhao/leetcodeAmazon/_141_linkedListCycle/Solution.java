package com.lzhao.leetcodeAmazon._141_linkedListCycle;

/**
 * Created by lzhao on 10/9/17.
 */

class Solution {

    boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
