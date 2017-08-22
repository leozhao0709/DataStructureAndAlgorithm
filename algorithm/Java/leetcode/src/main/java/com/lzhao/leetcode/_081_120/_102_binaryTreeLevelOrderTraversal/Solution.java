package com.lzhao.leetcode._081_120._102_binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    List<List<Integer>> levelOrder(final TreeNode root) {

        if (root == null) {
            return this.result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> subRes = new ArrayList<Integer>();
            for (int i = 0; i < size; i++)
            {
                TreeNode curr = queue.poll();
                subRes.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            this.result.add(subRes);
        }

        return this.result;
    }
}
