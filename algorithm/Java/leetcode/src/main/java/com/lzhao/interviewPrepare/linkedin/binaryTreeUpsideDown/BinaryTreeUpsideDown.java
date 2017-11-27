package com.lzhao.interviewPrepare.linkedin.binaryTreeUpsideDown;

/**
 * Created by lzhao on 11/25/17.
 */

class BinaryTreeUpsideDown {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }

    TreeNode upsideDown(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode temp = this.upsideDown(left);

        left.left = right;
        left.right = root;

        root.left = null;
        root.right = null;

        return temp;
    }

    String searialize(TreeNode root) {
        if (root == null) {
            return "null";
        }

        return String.valueOf(root.val) +
                "," +
                this.searialize(root.left) +
                "," +
                this.searialize(root.right);
    }
}
