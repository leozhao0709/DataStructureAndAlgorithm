package com.lzhao.leetcode._121_160._136_singleNumber;

/**
 * Created by lzhao on 8/26/17.
 */

class Solution {

    int singleNumber(int[] nums) {

        int res = nums[0];

        for (int i = 1; i <nums.length ; i++) {
            res ^= nums[i];
        }

        return res;
    }

}
