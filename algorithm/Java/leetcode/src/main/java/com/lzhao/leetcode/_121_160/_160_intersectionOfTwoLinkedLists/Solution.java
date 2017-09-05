package com.lzhao.leetcode._121_160._160_intersectionOfTwoLinkedLists;

/**
 * Created by lzhao on 9/4/17.
 */

class Solution {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        int n = 0;
        while (p != null) {
            p = p.next;
            n++;
        }

        ListNode q = headB;
        int m = 0;
        while (q != null) {
            q = q.next;
            m++;
        }

        p = headA;
        q = headB;

        if (n > m) {
            int index = 0;
            while (index < n - m) {
                p = p.next;
                index++;
            }
        }

        if (m > n) {
            int index = 0;
            while (index < m - n) {
                q = q.next;
                index++;
            }
        }

        while (p != null) {
            if (p == q) {
                return p;
            } else {
                p = p.next;
                q = q.next;
            }
        }

        return null;
    }
}
