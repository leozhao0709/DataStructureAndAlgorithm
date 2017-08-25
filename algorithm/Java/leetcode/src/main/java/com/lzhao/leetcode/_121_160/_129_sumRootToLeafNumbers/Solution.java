package com.lzhao.leetcode._121_160._129_sumRootToLeafNumbers;

/**
 * Created by lzhao on 8/24/17.
 */

class Solution {

    private int sum = 0;

    int sumNumbers(TreeNode root) {

        if (root == null) {
            return sum;
        }

        this.sumNumbers(root, 0);

        return sum;
    }

    private void sumNumbers(TreeNode treeNode, int lastSum) {
        int currSum = lastSum*10 + treeNode.val;
        if (treeNode.left == null && treeNode.right == null) {
            sum += currSum;
        } else if (treeNode.left == null) {
            this.sumNumbers(treeNode.right, currSum);
        } else if (treeNode.right == null) {
            this.sumNumbers(treeNode.left, currSum);
        } else {
            this.sumNumbers(treeNode.left, currSum);
            this.sumNumbers(treeNode.right, currSum);
        }
    }
}
