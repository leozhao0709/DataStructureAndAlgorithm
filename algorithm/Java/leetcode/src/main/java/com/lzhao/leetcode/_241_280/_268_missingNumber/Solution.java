package com.lzhao.leetcode._241_280._268_missingNumber;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    int missingNumber(int[] nums) {
        int[] temp = new int[nums.length+1];

        for (int i = 0; i < nums.length; i++)
        {
            temp[nums[i]] = 1;
        }

        for (int i = 0; i < nums.length+1; i++)
        {
            if (temp[i] != 1) {
                return i;
            }
        }

        return nums.length;
    }
}
