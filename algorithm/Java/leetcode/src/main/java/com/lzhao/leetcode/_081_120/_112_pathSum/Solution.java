package com.lzhao.leetcode._081_120._112_pathSum;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        return this.hasPathSum(root.left, sum - root.val) || this.hasPathSum(root.right, sum - root.val);
    }
}
