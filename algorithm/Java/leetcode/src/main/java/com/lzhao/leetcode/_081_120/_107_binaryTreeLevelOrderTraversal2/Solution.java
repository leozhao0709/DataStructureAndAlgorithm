package com.lzhao.leetcode._081_120._107_binaryTreeLevelOrderTraversal2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    private List<List<Integer>> result = new LinkedList<List<Integer>>();

    List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);


        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> subResult = new LinkedList<Integer>();

            for (int i = 0; i < count; i++) {
                TreeNode curr = queue.poll();
                subResult.add(curr.val);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            result.add(subResult);
        }

        Collections.reverse(this.result);

        return this.result;
    }
}
