package com.lzhao.leetcode._081_120._110_balancedBinaryTree;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(this.maxDepth(root.left, 1) - this.maxDepth(root.right, 1)) <= 1 && this.isBalanced(root.left) && this.isBalanced(root.right);
    }

    private int maxDepth(TreeNode treeNode, int lastDepth) {
        if (treeNode == null) {
            return lastDepth;
        }

        return Math.max(this.maxDepth(treeNode.left, lastDepth+1), this.maxDepth(treeNode.right, lastDepth+1));
    }

}
