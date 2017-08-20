package com.lzhao.leetcode._081_120._083_removeDuplicatesFromSortedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void deleteDuplicates() throws Exception {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node1;
        node1.next = node2;

        this.solution.deleteDuplicates(head);

        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        node2.next = node3;
        node3.next = node4;

        p = head;

        System.out.println();

        this.solution.deleteDuplicates(head);

        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

}