package com.lzhao.leetcode._081_120._109_convertSortedListToBST;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        int len = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            len++;
        }

        return this.sortedListToBST(head, 0, len-1);
    }

    private TreeNode sortedListToBST(ListNode head, int start, int end) {
        if (start > end || head == null) {
            return null;
        }

        int mid = (end - start)/2;
        int i = 0;

        ListNode p = head;
        while (i < mid) {
            p = p.next;
            i++;
        }

        TreeNode root = new TreeNode(p.val);
        root.left = this.sortedListToBST(head, start, start+mid-1);
        root.right = this.sortedListToBST(p.next, start+mid+1, end);

        return root;
    }

}
