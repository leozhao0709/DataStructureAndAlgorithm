package com.lzhao.leetcode._081_120._111_minimumDepthOfBT;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return this.minDepth(root, 1);
    }

    private int minDepth(TreeNode treeNode, int currentDepth) {
        if (treeNode.left == null && treeNode.right == null) {
            return currentDepth;
        } else if (treeNode.left == null) {
            return this.minDepth(treeNode.right, currentDepth+1);
        } else if (treeNode.right == null) {
            return this.minDepth(treeNode.left, currentDepth+1);
        } else {
            return Math.min(this.minDepth(treeNode.right, currentDepth+1), this.minDepth(treeNode.left, currentDepth+1));
        }
    }
}
