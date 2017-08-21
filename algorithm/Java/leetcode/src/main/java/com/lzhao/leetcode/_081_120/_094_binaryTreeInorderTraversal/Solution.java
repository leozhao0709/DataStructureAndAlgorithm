package com.lzhao.leetcode._081_120._094_binaryTreeInorderTraversal;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/20/17.
 */

class Solution {


    List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null) {
            return result;
        }

        result.addAll(this.inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(this.inorderTraversal(root.right));

        return result;
    }
}
