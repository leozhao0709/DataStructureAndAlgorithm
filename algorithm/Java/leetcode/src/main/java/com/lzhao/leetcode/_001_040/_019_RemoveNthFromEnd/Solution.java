package com.lzhao.leetcode._001_040._019_RemoveNthFromEnd;

/**
 * Created by lzhao on 8/5/17.
 */

class Solution {

    ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head;
        ListNode q = head;

        while (n > 0 && p != null) {
            n--;
            p = p.next;
        }

        

        return head;
    }
}
