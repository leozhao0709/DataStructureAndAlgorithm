package com.lzhao.leetcode._161_200._169_majorityElement;

/**
 * Created by lzhao on 9/6/17.
 */

class Solution {
    int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == candidate) {
                count++;
            } else if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
