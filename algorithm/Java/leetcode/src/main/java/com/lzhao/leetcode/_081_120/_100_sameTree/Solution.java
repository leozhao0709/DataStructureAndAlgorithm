package com.lzhao.leetcode._081_120._100_sameTree;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }
}
