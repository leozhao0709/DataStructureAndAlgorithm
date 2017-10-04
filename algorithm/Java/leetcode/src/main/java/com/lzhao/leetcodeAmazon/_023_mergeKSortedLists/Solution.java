package com.lzhao.leetcodeAmazon._023_mergeKSortedLists;

/**
 * Created by lzhao on 10/2/17.
 */

class Solution {

    ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return this.helper(lists, 0, lists.length-1);
    }

    private ListNode helper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int mid = start + (end - start)/2;
        ListNode l1 = this.helper(lists, start, mid);
        ListNode l2 = this.helper(lists, mid+1, end);

        return this.mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        ListNode p = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }

            p = p.next;
        }

        while (p1 != null) {
            p.next = p1;
            p1 = p1.next;
            p = p.next;
        }

        while (p2 != null) {
            p.next = p2;
            p2 = p2.next;
            p = p.next;
        }

        return dummy.next;
    }
}
