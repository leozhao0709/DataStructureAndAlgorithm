package com.lzhao.leetcodeLinkedin._023_mergeKLists;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {

    ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return this.merge(lists, 0, lists.length-1);
    }

    private ListNode merge(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int middle = start + (end - start)/2;
        ListNode one = this.merge(lists, start, middle);
        ListNode two = this.merge(lists, middle+1, end);
        return this.mergeTwoList(one, two);
    }

    private ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        ListNode p = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                p.next = new ListNode(p2.val);
                p2 = p2.next;
            } else {
                p.next = new ListNode(p1.val);
                p1 = p1.next;
            }

            p = p.next;
        }

        while (p1 != null) {
            p.next = new ListNode(p1.val);
            p = p.next;
            p1 = p1.next;
        }

        while (p2 != null) {
            p.next = new ListNode(p2.val);
            p = p.next;
            p2 = p2.next;
        }

        return dummy.next;
    }
}
