package com.lzhao.leetcodeLinkedin._152_maximumProductSubarray;

/**
 * Created by lzhao on 9/25/17.
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
                max[i] = Math.max(nums[i], nums[i]*max[i-1]);
                min[i] = Math.min(nums[i], nums[i]*min[i-1]);
            } else {
                max[i] = Math.max(nums[i], nums[i]*min[i-1]);
                min[i] = Math.min(nums[i], nums[i]*max[i-1]);
            }

            res = Math.max(res, max[i]);
        }

        return res;
    }
}
