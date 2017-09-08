package com.lzhao.leetcode._161_200._199_BTRightSideView;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lzhao on 9/8/17.
 */

class Solution {

    List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++)
            {
                TreeNode curr = queue.poll();
                if (i == 0) {
                    res.add(curr.val);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
            }
        }

        return res;
    }
}
