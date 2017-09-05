package com.lzhao.leetcode._161_200._162_findPeakElement;

/**
 * Created by lzhao on 9/4/17.
 */

class Solution {
    int findPeakElement(int[] nums) {
        int peak = nums[0];
        int peakIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1] && nums[i] > peak) {
                peak = nums[i];
                peakIndex = i;
            }
        }

        return peakIndex;
    }
}
