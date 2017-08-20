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

        ListNode pre = dummy;
        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            pre.next = curr;
            pre = pre.next;
            curr = curr.next;
        }

        return dummy.next;
    }

}
