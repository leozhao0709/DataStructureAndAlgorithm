package com.lzhao.leetcode._041_080._055_jumpGame;

/**
 * Created by lzhao on 8/14/17.
 */

class Solution {

    boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return true;
        }

        int step = nums[0];

        for (int i = 0; i <= step; i++)
        {
            if (nums[i] + i >= nums.length-1) {
                return true;
            }
            if (nums[i] + i > step) {
                step = nums[i] + i;
            }
        }

        return false;
    }
}
