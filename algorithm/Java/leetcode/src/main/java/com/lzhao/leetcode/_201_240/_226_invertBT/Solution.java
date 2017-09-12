package com.lzhao.leetcode._201_240._226_invertBT;

/**
 * Created by lzhao on 9/11/17.
 */

class Solution {

    TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        this.invertTree(root.left);
        this.invertTree(root.right);

        return root;
    }
}
