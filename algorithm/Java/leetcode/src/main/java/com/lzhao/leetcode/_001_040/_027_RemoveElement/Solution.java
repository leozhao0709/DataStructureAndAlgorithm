package com.lzhao.leetcode._001_040._027_RemoveElement;

/**
 * Created by lzhao on 8/7/17.
 */

class Solution {

    int removeElement(int[] nums, int val) {
        int result = 0;

        int j = -1;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val) {
                result++;
                if (j != -1) {
                    this.swap(nums, i, j);
                    j++;
                }
            } else {
                if (j == -1) {
                    j = i;
                }
            }
        }

        return result;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
