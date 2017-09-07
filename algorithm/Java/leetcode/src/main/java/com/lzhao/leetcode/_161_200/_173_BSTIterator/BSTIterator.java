package com.lzhao.leetcode._161_200._173_BSTIterator;

import java.util.Stack;

/**
 * Created by lzhao on 9/6/17.
 */

class BSTIterator {

    private Stack<TreeNode> stack;

    BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        if (root != null) {
            this.stack.push(root);
            this.pushLeft(root.left);
        }
    }

    private void pushLeft(TreeNode node) {
        if (node != null) {
            while (node != null) {
                this.stack.push(node);
                node = node.left;
            }
        }
    }

    /** @return whether we have a next smallest number */
    boolean hasNext() {
        return !this.stack.isEmpty();
    }

    /** @return the next smallest number */
    int next() {
        TreeNode node = this.stack.pop();
        if (node.right != null) {
            this.stack.push(node.right);
            this.pushLeft(node.right.left);
        }

        return node.val;
    }
}
