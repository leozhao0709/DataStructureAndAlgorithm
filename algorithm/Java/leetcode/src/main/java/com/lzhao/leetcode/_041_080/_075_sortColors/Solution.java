package com.lzhao.leetcode._041_080._075_sortColors;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {

    void sortColors(int[] nums) {
        // [lt, gt] is equal to 1
        int lt = 0; // [0, lt) smaller than 1
        int gt = nums.length - 1; // (gt, num.length-1] bigger than 1
        
        int i = 0;

        while (i <= gt) {
            if (nums[i] > 1) {
                this.swap(nums, i, gt);
                gt--;
            } else if (nums[i] < 1) {
                this.swap(nums, i, lt);
                lt++;
                i++;
            } else {
                i++;
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
