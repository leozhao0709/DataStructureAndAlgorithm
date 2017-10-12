package com.lzhao.leetcodeAmazon._235_lowestCommonAncestorOfBST;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (p.val < root.val && q.val < root.val) {
            return this.lowestCommonAncestor(root.left, p, q);
        }

        if (p.val > root.val && q.val > root.val) {
            return this.lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
