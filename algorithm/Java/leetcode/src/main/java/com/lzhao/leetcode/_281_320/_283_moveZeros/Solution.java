package com.lzhao.leetcode._281_320._283_moveZeros;

/**
 * Created by lzhao on 9/14/17.
 */

class Solution {

    void moveZeroes(int[] nums) {
        int curPos = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0) {
                nums[curPos] = nums[i];
                curPos++;
            }
        }

        for (int i = curPos; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }
}
