package com.lzhao.leetcodeLinkedin._053_maximumSubArray;

/**
 * Created by lzhao on 9/24/17.
 */

class Solution {

    int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1] >= 0? dp[i-1]+nums[i]:nums[i];
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
