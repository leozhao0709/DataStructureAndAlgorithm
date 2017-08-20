package com.lzhao.leetcode._081_120._086_partitionList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lzhao on 8/19/17.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void partition() throws Exception {
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);

        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode p = this.solution.partition(head1, 3);
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

}