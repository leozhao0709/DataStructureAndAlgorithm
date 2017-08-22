package com.lzhao.leetcode._081_120._114_flattenBTtoLinkList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    private List<Integer> temp = new LinkedList<Integer>();

    void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        this.preOrder(root);

        root.left = null;

        TreeNode p = root;
        for (int i = 1; i < temp.size(); i++)
        {
            TreeNode treeNode = new TreeNode(temp.get(i));
            p.right = treeNode;
            p = p.right;
        }
    }

    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        this.temp.add(node.val);
        this.preOrder(node.left);
        this.preOrder(node.right);
    }
}
