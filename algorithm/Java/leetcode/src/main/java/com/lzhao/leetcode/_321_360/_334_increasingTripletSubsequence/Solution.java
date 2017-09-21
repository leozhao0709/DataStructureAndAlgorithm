package com.lzhao.leetcode._321_360._334_increasingTripletSubsequence;

/**
 * Created by lzhao on 9/20/17.
 */

class Solution {

    boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        
        int left = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] <= left) {
                left = nums[i];
            } else if (nums[i] <= middle) {
                middle = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
