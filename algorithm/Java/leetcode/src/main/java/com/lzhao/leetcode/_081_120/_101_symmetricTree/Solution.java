package com.lzhao.leetcode._081_120._101_symmetricTree;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return this.isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            if (node1.val == node2.val) {
                return this.isSymmetric(node1.left, node2.right) && this.isSymmetric(node1.right, node2.left);
            }
        }

        return false;
    }
}
