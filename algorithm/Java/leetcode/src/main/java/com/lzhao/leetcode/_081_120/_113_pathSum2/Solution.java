package com.lzhao.leetcode._081_120._113_pathSum2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    private List<List<Integer>> res = new LinkedList<List<Integer>>();

    List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return res;
        }

        this.helper(root, sum, new LinkedList<Integer>());

        return this.res;
    }

    private void helper(TreeNode treeNode, int sum, List<Integer> list) {
        if (treeNode == null) {
            return;
        }

        List<Integer> temp = new LinkedList<Integer>(list);
        temp.add(treeNode.val);

        if (treeNode.val == sum && treeNode.left == null && treeNode.right == null) {
            this.res.add(temp);
            return;
        }

        this.helper(treeNode.left, sum-treeNode.val, temp);
        this.helper(treeNode.right, sum-treeNode.val, temp);
    }

}
