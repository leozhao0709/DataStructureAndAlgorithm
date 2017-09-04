package com.lzhao.leetcode._121_160._152_maximumProductSubarray;

/**
 * Created by lzhao on 8/30/17.
 */

class Solution {

    int maxProduct(int[] nums) {
        int res = nums[0];

        int[] max = new int[nums.length];
        int[] min = new int[nums.length];

        max[0] = nums[0];
        min[0] = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > 0) {
                max[i] = Math.max(nums[i], max[i-1]*nums[i]);
                min[i] = Math.min(nums[i], min[i-1]*nums[i]);
            } else {
                max[i] = Math.max(nums[i], min[i-1] * nums[i]);
                min[i] = Math.min(nums[i], max[i-1] * nums[i]);
            }
            res = Math.max(res, max[i]);
        }

        return res;
    }

}
