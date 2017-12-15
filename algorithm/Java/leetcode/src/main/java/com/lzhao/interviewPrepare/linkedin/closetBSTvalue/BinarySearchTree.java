package com.lzhao.interviewPrepare.linkedin.closetBSTvalue;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 12/6/17.
 */

class BinarySearchTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }

    List<Integer> closestKValues(TreeNode root, double target, int k) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        this.inorderTraverse(root, target, k, res);
        return res;
    }

    private void inorderTraverse(TreeNode root, double target, int k, LinkedList<Integer> res) {
        if (root == null) {
            return;
        }

        this.inorderTraverse(root.left, target, k, res);

        if (res.size() < k) {
            res.add(root.val);
        } else {
            if (Math.abs(target - res.getFirst()) > Math.abs(target - root.val)) {
                res.removeFirst();
                res.add(root.val);
            } else {
                return;
            }
        }

        this.inorderTraverse(root.right, target, k, res);
    }
}
