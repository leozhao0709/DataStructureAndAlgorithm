package com.lzhao.leetcodeAmazon._236_lowestCommonAncestorOfBT;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p) {
            return p;
        }

        if (root == q) {
            return q;
        }

        TreeNode left = this.lowestCommonAncestor(root.left, p, q);
        TreeNode right = this.lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left!=null?left:right;
    }
}
