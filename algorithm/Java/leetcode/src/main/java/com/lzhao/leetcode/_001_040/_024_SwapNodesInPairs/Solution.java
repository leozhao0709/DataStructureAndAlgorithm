package com.lzhao.leetcode._001_040._024_SwapNodesInPairs;

/**
 * Created by lzhao on 8/7/17.
 */

class Solution {

    ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            ListNode third = current.next.next.next;

            second.next = first;
            first.next = third;
            current.next = second;

            current = first;
        }


        return dummy.next;
    }
}
