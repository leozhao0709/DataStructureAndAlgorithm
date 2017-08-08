package com.lzhao.leetcode._001_040._026_RemoveDuplicatesFromSortedArray;

/**
 * Created by lzhao on 8/7/17.
 */

class Solution {
    int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int len = 1;
        int j = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1]) {
                len++;
                nums[j] = nums[i];
                j++;
            }
        }

        return len;
    }

}
