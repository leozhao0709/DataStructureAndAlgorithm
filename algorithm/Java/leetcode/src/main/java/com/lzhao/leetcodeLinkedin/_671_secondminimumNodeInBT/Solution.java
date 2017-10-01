package com.lzhao.leetcodeLinkedin._671_secondminimumNodeInBT;

/**
 * Created by lzhao on 9/30/17.
 */

class Solution {

    private int first;
    private int second;

    int findSecondMinimumValue(TreeNode root) {
        first = root.val;
        second = Integer.MAX_VALUE;

        this.helper(root);

        return first >= second || second == Integer.MAX_VALUE?-1:second;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        
        if (root.val > this.first && root.val < second) {
            second = root.val;
        }

        this.helper(root.left);
        this.helper(root.right);
    }
}
