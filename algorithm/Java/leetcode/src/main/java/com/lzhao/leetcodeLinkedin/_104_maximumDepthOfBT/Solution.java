package com.lzhao.leetcodeLinkedin._104_maximumDepthOfBT;

/**
 * Created by lzhao on 9/25/17.
 */

class Solution {
    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1+Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
    }
}
