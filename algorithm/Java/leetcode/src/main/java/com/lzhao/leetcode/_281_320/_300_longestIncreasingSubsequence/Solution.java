package com.lzhao.leetcode._281_320._300_longestIncreasingSubsequence;

/**
 * Created by lzhao on 9/17/17.
 */

class Solution {

    int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }

            res = Math.max(res, dp[i]);
        }

        return res+1;
    }
}
