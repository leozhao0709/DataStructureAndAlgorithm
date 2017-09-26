package com.lzhao.leetcodeLinkedin._102_BTLevelOrderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lzhao on 9/25/17.
 */

class Solution {

    List<List<Integer>> levelOrder(final TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            for (int i = 0; i < size; i++)
            {
                TreeNode curr = queue.poll();
                temp.add(curr.val);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            res.add(temp);
        }

        return res;
    }
}
