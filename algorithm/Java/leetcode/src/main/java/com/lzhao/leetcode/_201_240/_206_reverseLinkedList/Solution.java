package com.lzhao.leetcode._201_240._206_reverseLinkedList;

/**
 * Created by lzhao on 9/9/17.
 */

class Solution {

    ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode curr = head.next;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }

        head.next = null;
        return pre;
    }
}
