package com.lzhao.leetcode._201_240._209_minimumSizeSubArraySum;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    int minSubArrayLen(int s, int[] nums) {
        int left=0, right=0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            if (sum >= s) {
                if (right - left + 1 < res) {
                    res = right - left + 1;
                }
                sum -= nums[left];
                sum -= nums[right];
                left++;
            } else {
                right++;
            }
        }

        if (res == Integer.MAX_VALUE) {
            return 0;
        }

        return res;
    }
}
