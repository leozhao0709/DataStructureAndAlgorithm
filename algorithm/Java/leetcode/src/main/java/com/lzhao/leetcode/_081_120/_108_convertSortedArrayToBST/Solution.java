package com.lzhao.leetcode._081_120._108_convertSortedArrayToBST;

/**
 * Created by lzhao on 8/21/17.
 */

class Solution {

    TreeNode sortedArrayToBST(int[] nums) {
        return this.sortedArrayToBST(nums, 0, nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = this.sortedArrayToBST(nums, start, mid-1);
        root.right = this.sortedArrayToBST(nums, mid+1, end);

        return root;
    }
}
