package com.lzhao.leetcode._001_040._002_AddTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 6/21/17.
 */
public class SolutionTest {
    @Test
    public void addTwoNumbers() throws Exception {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(0);

        ListNode result1 = solution.addTwoNumbers(l1, l2);
        ListNode result2 = solution.addTwoNumbers(l1, l3);

        ListNode expect1 = new ListNode(7);
        expect1.next = new ListNode(0);
        expect1.next.next = new ListNode(8);

        assertEquals(expect1, result1);

        ListNode expect2 = new ListNode(2);
        expect2.next = new ListNode(4);
        expect2.next.next = new ListNode(3);
        assertEquals(expect2, result2);

    }

}