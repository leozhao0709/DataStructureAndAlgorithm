package com.lzhao.leetcodeAmazon._098_validateBST;

/**
 * Created by lzhao on 10/5/17.
 */

class Solution {

    boolean isValidBST(TreeNode root) {
        return this.helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }

        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }

        return this.helper(root.left, minValue, root.val)&&this.helper(root.right, root.val, maxValue);
    }
}
