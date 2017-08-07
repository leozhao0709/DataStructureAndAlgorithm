package com.lzhao.leetcode._001_040._021_MergeTwoLists;

/**
 * Created by lzhao on 8/6/17.
 */

class Solution {

    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head;
        ListNode p = l1;
        ListNode q = l2;
        if (l1.val < l2.val) {
            head = new ListNode(l1.val);
            p = p.next == null? null: p.next;
        } else {
            head = new ListNode(l2.val);
            q = q.next == null? null: q.next;
        }
        ListNode m = head;

        while (p != null && q != null) {
            if (p.val < q.val) {
                m.next = new ListNode(p.val);
                m = m.next;
                p = p.next;
            } else {
                m.next = new ListNode(q.val);
                m = m.next;
                q = q.next;
            }
        }

        while (p!=null) {
            m.next = new ListNode(p.val);
            m = m.next;
            p = p.next;
        }

        while (q!=null) {
            m.next = new ListNode(q.val);
            m = m.next;
            q = q.next;
        }

        return head;
    }
}
