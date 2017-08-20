package com.lzhao.leetcode._081_120._086_partitionList;

/**
 * Created by lzhao on 8/19/17.
 */

class Solution {

    ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }

        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);

        ListNode curr = head;
        ListNode smallCurr = smallDummy;
        ListNode bigCurr = bigDummy;
        while (curr != null) {
            if (curr.val < x) {
                smallCurr.next = new ListNode(curr.val);
                smallCurr = smallCurr.next;
            } else {
                bigCurr.next = new ListNode(curr.val);
                bigCurr = bigCurr.next;
            }
            curr = curr.next;
        }

        if (smallDummy.next == null) {
            return bigDummy.next;
        }

        smallCurr.next = bigDummy.next;

        return smallDummy.next;
    }
}
