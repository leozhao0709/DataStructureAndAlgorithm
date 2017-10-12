package com.lzhao.leetcodeAmazon._206_reverseLinkedList;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }

        head.next = null;

        return first;
    }
}
