package com.lzhao.leetcode._081_120._103_binaryTreeZigzagLevelOrderTraversal;

import java.util.*;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    private List<List<Integer>> res = new ArrayList<List<Integer>>();

    List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }

//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.push(root);
//        boolean addFromLeft = true;
//        while (!stack.empty()) {
//            List<Integer> subres = new ArrayList<Integer>();
//            int count = stack.size();
//            Stack<TreeNode> currStack = new Stack<TreeNode>();
//            for (int i = 0; i < count; i++)
//            {
//                TreeNode curr = stack.pop();
//                subres.add(curr.val);
//                if (addFromLeft) {
//                    if (curr.left != null) {
//                        currStack.push(curr.left);
//                    }
//                    if (curr.right != null) {
//                        currStack.push(curr.right);
//                    }
//                } else {
//                    if (curr.right != null) {
//                        currStack.push(curr.right);
//                    }
//                    if (curr.left != null) {
//                        currStack.push(curr.left);
//                    }
//                }
//            }
//            addFromLeft = !addFromLeft;
//            stack = currStack;
//            this.res.add(subres);
//        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean startFromLeft = true;
        while (!queue.isEmpty()) {
            List<Integer> subRes = new ArrayList<Integer>();
            int count = queue.size();
            for (int i = 0; i < count; i++)
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

            if (!startFromLeft) {
                Collections.reverse(subRes);
            }
            startFromLeft = !startFromLeft;
            this.res.add(subRes);
        }

        return this.res;
    }
}
