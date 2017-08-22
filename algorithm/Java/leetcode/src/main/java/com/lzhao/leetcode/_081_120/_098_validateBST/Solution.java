package com.lzhao.leetcode._081_120._098_validateBST;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    boolean isValidBST(TreeNode root) {
        return this.isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long minValue, long maxValue) {
        if (node == null) {
            return true;
        }

        if (node.val <= minValue || node.val >= maxValue) {
            return false;
        }

        return this.isValidBST(node.left, minValue, node.val)&&this.isValidBST(node.right, node.val, maxValue);
    }
}
