package com.lzhao.leetcode._121_160._141_linkedListCycle;

/**
 * Created by lzhao on 8/28/17.
 */

class Solution {

    boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode dummy = new ListNode(0);

        ListNode p = head;

        while (p != null) {
            if (p.next == dummy) {
                return true;
            }
            ListNode temp = p.next;
            p.next = dummy;
            p = temp;
        }

        return false;
    }
}
