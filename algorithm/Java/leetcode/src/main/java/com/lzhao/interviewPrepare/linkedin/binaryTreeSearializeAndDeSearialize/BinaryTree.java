package com.lzhao.interviewPrepare.linkedin.binaryTreeSearializeAndDeSearialize;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lzhao on 11/23/17.
 */

class BinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

     String searialize(TreeNode root) {
        if (root == null)
        {
            return "null";
        }

        return String.valueOf(root.val) +
                "," +
                this.searialize(root.left) +
                "," +
                this.searialize(root.right);
    }

    TreeNode desearialize(String s) {
        String[] strs = s.split(",");
        Queue<String> queue = new LinkedList<String>(Arrays.asList(strs));

        return this.helper(queue);
    }

    private TreeNode helper(Queue<String> queue) {
        String curr = queue.poll();
        if (curr.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(curr));
        root.left = this.helper(queue);
        root.right = this.helper(queue);

        return root;
    }

    void preOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        this.preOrderTraverse(root.left);
        this.preOrderTraverse(root.right);
    }
}
