package com.lzhao.leetcode._121_160._153_findMinimumInRotatedSortedArray;

/**
 * Created by lzhao on 8/30/17.
 */

class Solution {

    private int min = Integer.MAX_VALUE;

    int findMin(int[] nums) {

        return this.findMin(nums, 0, nums.length-1);
    }

    private int findMin(int[] nums, int left, int right) {
        if (left > right) {
            return this.min;
        }

        int middle = left + (right-left)/2;
        if (nums[middle] < min) {
            this.min = nums[middle];
        }

        if (nums[middle] > nums[right]) {
            return this.findMin(nums, middle+1, right);
        } else {
            return this.findMin(nums, left, middle-1);
        }
    }

}
