package com.lzhao.leetcode._121_160._144_BSTPreorder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/29/17.
 */

class Solution {

    private List<Integer> res = new LinkedList<Integer>();

    List<Integer> preorderTraversal(TreeNode root) {

        this.preorderTraversalHelp(root);

        return res;
    }

    private void preorderTraversalHelp(TreeNode root) {
        if (root == null) {
            return;
        }

        this.res.add(root.val);
        this.preorderTraversalHelp(root.left);
        this.preorderTraversalHelp(root.right);
    }
}
