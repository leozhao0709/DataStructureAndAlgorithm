package com.lzhao.leetcode._001_040._019_RemoveNthFromEnd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/5/17.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void removeNthFromEnd() throws Exception {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node = this.solution.removeNthFromEnd(node1, 2);

        ListNode p = node;
        while (p != null) {
            System.out.println(p.val + " ");
            p = p.next;
        }
    }

}