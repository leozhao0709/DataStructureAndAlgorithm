package com.lzhao.leetcodeAmazon._002_addTwoNumbers;

import java.math.BigInteger;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        int sum;
        int carry = 0;

        ListNode p = l1;
        ListNode q = l2;
        ListNode res = dummy;
        while (p != null && q != null) {
            sum = p.val+q.val+carry>9? p.val+q.val+carry-10:p.val+q.val+carry;
            carry = p.val+q.val+carry>9?1:0;
            res.next = new ListNode(sum);
            res = res.next;
            p = p.next;
            q = q.next;
        }

        while (p != null) {
            sum = p.val+carry>9? p.val+carry-10:p.val+carry;
            carry = p.val+carry>9?1:0;
            res.next = new ListNode(sum);
            res = res.next;
            p = p.next;
        }

        while (q != null) {
            sum = q.val+carry>9? q.val+carry-10:q.val+carry;
            carry = q.val+carry>9?1:0;
            res.next = new ListNode(sum);
            res = res.next;
            q = q.next;
        }

        if (carry > 0) {
            res.next = new ListNode(1);
        }

        return dummy.next;
    }

}
