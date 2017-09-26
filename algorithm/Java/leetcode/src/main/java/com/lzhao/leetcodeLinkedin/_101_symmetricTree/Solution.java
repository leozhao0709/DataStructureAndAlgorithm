package com.lzhao.leetcodeLinkedin._101_symmetricTree;

/**
 * Created by lzhao on 9/25/17.
 */

class Solution {

    boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return this.helper(root.left, root.right);
    }

    boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 !=null) {
            if (root1.val != root2.val) {
                return false;
            } else {
                return this.helper(root1.left, root2.right) && this.helper(root1.right, root2.left);
            }
        }

        return false;
    }
}
