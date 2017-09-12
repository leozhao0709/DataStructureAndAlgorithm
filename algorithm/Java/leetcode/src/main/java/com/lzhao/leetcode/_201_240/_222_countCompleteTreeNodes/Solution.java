package com.lzhao.leetcode._201_240._222_countCompleteTreeNodes;

/**
 * Created by lzhao on 9/11/17.
 */

class Solution {

    int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftChildHeight = this.getHeight(root.left);
        int rightChildHeight = this.getHeight(root.right);

        if (leftChildHeight == rightChildHeight) {
            // in this situation, left child is full tree

            return (1<<leftChildHeight) + this.countNodes(root.right);
        } else {
            // in this situation, left child is more than right child, then right child is full tree
            return (1<<rightChildHeight) + this.countNodes(root.left);
        }
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + this.getHeight(root.left);
        }
    }
}
