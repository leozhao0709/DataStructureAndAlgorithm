package com.lzhao.interviewPrepare.linkedin.validBST;

/**
 * Created by lzhao on 11/29/17.
 */

class ValidBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    boolean isValidBST(TreeNode root) {
        return this.isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValidBST(TreeNode root, long maxValue, long minValue) {
        if (root == null) {
            return true;
        }

        if (root.val >= maxValue || root.val <= minValue) {
            return false;
        }
        return this.isValidBST(root.left, root.val, minValue) && this.isValidBST(root.right, maxValue, root.val);
    }
}
