package com.lzhao.interviewPrepare.linkedin.treePathSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 11/24/17.
 */

class TreePathSum {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }

    List<Integer> pathSum1(TreeNode root, int target) {
        List<Integer> res = new ArrayList<Integer>();
        this.helper(root, target, new ArrayList<Integer>(), res);
        return res;
    }

    private void helper(TreeNode root, int target, ArrayList<Integer> curr, List<Integer> res) {
        if (res.size() > 0) {
            return;
        }

        if (root == null && target == 0) {
            res.addAll(new ArrayList<Integer>(curr));
            return;
        }

        if (root == null) {
            return;
        }


        curr.add(root.val);

        this.helper(root.left, target-root.val, curr, res);
        this.helper(root.right, target-root.val, curr, res);
        curr.remove(curr.size()-1);
    }
    
    List<Integer> pathSum(TreeNode root, int target) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        
        if (root.left == null && root.right == null && root.val == target) {
            res.add(root.val);
            return res;
        }

        List<Integer> resLeft = this.pathSum(root.left, target - root.val);
        if (resLeft.size() > 0) {
            res.add(root.val);
            res.addAll(resLeft);
            return res;
        }

        List<Integer> resRight = this.pathSum(root.right, target-root.val);
        if (resRight.size() > 0) {
            res.add(root.val);
            res.addAll(resRight);
            return res;
        }

        return res;
    }

}
