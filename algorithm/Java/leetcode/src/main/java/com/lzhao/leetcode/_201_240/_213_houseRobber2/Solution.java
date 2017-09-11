package com.lzhao.leetcode._201_240._213_houseRobber2;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return nums[0];
        }

        int[] robFirst = new int[n];
        int[] robNoFirst = new int[n];

        robFirst[0] = nums[0];
        robFirst[1] = nums[0];
        robNoFirst[0] = 0;
        robNoFirst[1] = nums[1];

        for (int i = 2; i < n; i++)
        {
            if (i != n-1) {
                robFirst[i] = Math.max(robFirst[i-1], robFirst[i-2]+nums[i]);
            }
            robNoFirst[i] = Math.max(robNoFirst[i-1], robNoFirst[i-2]+nums[i]);
        }

        return Math.max(robFirst[n-2], robNoFirst[n-1]);
    }
}
