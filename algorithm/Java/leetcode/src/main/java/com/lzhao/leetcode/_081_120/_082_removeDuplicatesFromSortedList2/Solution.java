package com.lzhao.leetcode._081_120._082_removeDuplicatesFromSortedList2;

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
            boolean duplicated = false;
            while (curr.next != null && curr.next.val == curr.val) {
                duplicated = true;
                curr = curr.next;
            }

            if (duplicated) {
                pre.next = curr.next;
                curr = curr.next;
            } else {
                pre = pre.next;
                curr = curr.next;
            }

        }

        return dummy.next;
    }
}
