package com.lzhao.leetcode._201_240._237_deleteNodeInALinkedList;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
