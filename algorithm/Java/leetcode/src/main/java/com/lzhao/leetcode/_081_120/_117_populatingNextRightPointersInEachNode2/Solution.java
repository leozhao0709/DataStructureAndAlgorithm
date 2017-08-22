package com.lzhao.leetcode._081_120._117_populatingNextRightPointersInEachNode2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();

            for (int i = 0; i < count; i++)
            {
                TreeLinkNode curr = queue.poll();
                if (i != count-1) {
                    curr.next = queue.peek();
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
    }
}
