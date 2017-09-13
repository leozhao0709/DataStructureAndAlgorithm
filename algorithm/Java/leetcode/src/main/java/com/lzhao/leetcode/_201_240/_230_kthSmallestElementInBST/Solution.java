package com.lzhao.leetcode._201_240._230_kthSmallestElementInBST;

import java.util.Stack;

/**
 * Created by lzhao on 9/12/17.
 */

class Solution {

    private Stack<TreeNode> stack = new Stack<TreeNode>();

    int kthSmallest(TreeNode root, int k) {
        this.pushLeft(root);

        while (!this.stack.isEmpty()) {
            TreeNode curr = stack.pop();
            k--;
            if (k == 0) {
                return curr.val;
            }
            this.pushLeft(curr.right);
        }

        return -1;
    }

    private void pushLeft(TreeNode root) {
        if (root == null) {
            return;
        }

        this.stack.push(root);
        this.pushLeft(root.left);
    }
}
