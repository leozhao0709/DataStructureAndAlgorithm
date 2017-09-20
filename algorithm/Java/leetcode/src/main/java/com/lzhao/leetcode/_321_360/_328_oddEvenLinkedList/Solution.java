package com.lzhao.leetcode._321_360._328_oddEvenLinkedList;

/**
 * Created by lzhao on 9/19/17.
 */

class Solution {

    ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode currOdd = head;
        ListNode currEven = head.next;
        ListNode evenHead = head.next;

        while (currEven != null &&currEven.next != null) {
            currOdd.next = currEven.next;
            currOdd = currOdd.next;
            currEven.next = currOdd.next;
            currEven = currEven.next;
        }

        currOdd.next = evenHead;
        return head;
    }
}
