package com.lzhao.leetcode._241_280._242_BTPaths;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<String>();

        this.helper(root, "", list);

        return list;
    }

    private void helper(TreeNode root, String currentPath, List<String> list) {
        if (root == null) {
            return;
        }

        currentPath += root.val;

        if (root.left == null && root.right == null) {
            list.add(currentPath);
            return;
        }

        currentPath += "->";
        this.helper(root.left, currentPath, list);
        this.helper(root.right, currentPath, list);
    }
}
