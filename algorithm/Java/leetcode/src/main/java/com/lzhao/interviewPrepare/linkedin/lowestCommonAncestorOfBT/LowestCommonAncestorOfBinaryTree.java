package com.lzhao.interviewPrepare.linkedin.lowestCommonAncestorOfBT;

/**
 * Created by lzhao on 11/26/17.
 */

class LowestCommonAncestorOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }


    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!findNode(root, p) || !findNode(root, q)) {
            return null;
        }

        return this.helper(root, p, q);
    }

    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = this.helper(root.left, p, q);
        TreeNode right = this.helper(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null?right:left;
    }

    private boolean findNode(TreeNode root, TreeNode node) {
        if (root == null && node != null) {
            return false;
        }

        if (root == node) {
            return true;
        }

        return this.findNode(root.left, node) || this.findNode(root.right, node);
    }
}
