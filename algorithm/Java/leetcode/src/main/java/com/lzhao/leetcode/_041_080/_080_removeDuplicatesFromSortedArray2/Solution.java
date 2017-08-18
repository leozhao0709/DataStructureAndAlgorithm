package com.lzhao.leetcode._041_080._080_removeDuplicatesFromSortedArray2;

/**
 * Created by lzhao on 8/17/17.
 */

class Solution {

    int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int result = 1;
        int count = 0;
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
                count = 0;
                result++;
            } else {
                if (count < 1) {
                    nums[index++] = nums[i];
                    count++;
                    result++;
                }
            }
        }

        return result;
    }
}
