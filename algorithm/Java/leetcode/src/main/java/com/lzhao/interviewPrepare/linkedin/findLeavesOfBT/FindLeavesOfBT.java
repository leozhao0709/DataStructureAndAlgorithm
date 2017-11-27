package com.lzhao.interviewPrepare.linkedin.findLeavesOfBT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 11/23/17.
 */

class FindLeavesOfBT {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        this.getHeight(root, res);
        return res;
    }

    private int getHeight(TreeNode root, List<List<Integer>> res) {
        if (root == null) {
            return -1;
        }

        int height = 1 + Math.max(this.getHeight(root.left, res), this.getHeight(root.right, res));
        if (height >= res.size()) {
            res.add(new ArrayList<Integer>());
        }
        res.get(height).add(root.val);
        return height;
    }
}
