package com.lzhao.leetcodeLinkedin._366_findLeavesOfBT;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/29/17.
 */

class Solution {

    List<List<Integer>> findLeaves(TreeNode root) {
        int depth = this.depth(root);
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        for (int i = 0; i < depth; i++)
        {
            res.add(new LinkedList<Integer>());
        }

        this.helper(root, res);

        return res;
    }

    private void helper(TreeNode root, List<List<Integer>> res) {
        if (root == null) {
            return;
        }

        int depth = this.depth(root);
        res.get(depth-1).add(root.val);
        this.helper(root.left, res);
        this.helper(root.right, res);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1+Math.max(this.depth(root.left), this.depth(root.right));
    }
}
