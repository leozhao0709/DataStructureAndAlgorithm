package com.lzhao.leetcode._041_080._051_maxSubArray;

/**
 * Created by lzhao on 8/13/17.
 */

class Solution {
     int maxSubArray(int[] nums) {
         int max = nums[0];
         int c_sum = nums[0];
         for (int i = 1; i < nums.length; i++) {
             if (c_sum < 0) {
                 c_sum = 0;
             }
             c_sum += nums[i];
             if (c_sum > max) {
                 max = c_sum;
             }
         }

         return max;
     }
}
