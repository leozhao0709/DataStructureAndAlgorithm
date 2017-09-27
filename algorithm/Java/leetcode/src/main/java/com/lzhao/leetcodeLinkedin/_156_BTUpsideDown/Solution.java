package com.lzhao.leetcodeLinkedin._156_BTUpsideDown;

/**
 * Created by lzhao on 9/26/17.
 */

class Solution {

    TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode temp = this.upsideDownBinaryTree(left);

        left.left = right;
        left.right = root;

        root.right = null;
        root.left = null;

        return temp;
    }
}
