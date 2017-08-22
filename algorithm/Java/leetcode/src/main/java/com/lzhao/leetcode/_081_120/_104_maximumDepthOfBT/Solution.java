package com.lzhao.leetcode._081_120._104_maximumDepthOfBT;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }

        return this.helper(root, 0);
    }

    private int helper(TreeNode node, int lastDepth) {
//        if (node.left == null && node.right == null) {
//            return depth;
//        } else if (node.left == null && node.right != null) {
//            return this.helper(node.right, depth+1);
//        } else if (node.left != null && node.right == null) {
//            return this.helper(node.left, depth+1);
//        } else {
//            return Math.max(this.helper(node.left, depth+1), this.helper(node.right, depth+1));
//        }

        if (node == null) {
            return lastDepth;
        }

        return Math.max(this.helper(node.left, lastDepth+1), this.helper(node.right, lastDepth+1));
    }
}
