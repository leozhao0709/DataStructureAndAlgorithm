package com.lzhao.leetcode._121_160._137_singleNumber2;

import java.util.Arrays;

/**
 * Created by lzhao on 8/26/17.
 */

class Solution {

    int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i=i+3) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}
