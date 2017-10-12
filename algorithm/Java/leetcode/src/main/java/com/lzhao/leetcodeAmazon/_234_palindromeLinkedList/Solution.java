package com.lzhao.leetcodeAmazon._234_palindromeLinkedList;

import java.util.Stack;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<ListNode> stack = new Stack<ListNode>();

        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }

        p = head;

        while (p != null) {
            if (p.val != stack.pop().val) {
                return false;
            }
            p = p.next;
        }

        return true;
    }
}
