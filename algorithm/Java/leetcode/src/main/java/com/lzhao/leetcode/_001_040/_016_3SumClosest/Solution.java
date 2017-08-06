package com.lzhao.leetcode._001_040._016_3SumClosest;

import java.util.Arrays;

/**
 * Created by lzhao on 8/5/17.
 */

class Solution {
    int threeSumClosest(int[] nums, int target) {
        int result = target;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int low = i+1;
            int high = nums.length - 1;
            while (low < high) {
                int diff = Math.abs(current + nums[low] + nums[high] - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    result = current + nums[low] + nums[high];
                }

                if (current + nums[low] + nums[high] < target) {
                    low++;
                } else if (current + nums[low] + nums[high] > target) {
                    high--;
                } else {
                    return result;
                }
            }
        }

        return result;
    }
}
