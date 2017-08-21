package com.lzhao.leetcode._081_120._092_reverseLinkedList2;

/**
 * Created by lzhao on 8/20/17.
 */

class Solution {
    
    ListNode reverseBetween(ListNode head, int m, int n) {
        
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;

        int i = 0;
        while (i < m - 1) {
            pre = pre.next;
            i++;
        }

        ListNode curr = pre.next;

        ListNode last = curr;

        i = m;
        while (i < n) {
            last = last.next;
            i++;
        }

        i = m;
        pre.next = last;
        while (i < n) {
            i++;
            ListNode temp = curr;
            curr = temp.next;
            temp.next = last.next;
            last.next = temp;

        }

        return dummy.next;
    }
}
