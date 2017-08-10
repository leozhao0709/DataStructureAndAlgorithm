package com.lzhao.leetcode._001_040._031_NextPermutation;

import java.util.Arrays;

/**
 * Created by lzhao on 8/9/17.
 */

class Solution {

    void nextPermutation(int[] nums) {
        int i = -1;

        for (int j = nums.length - 2; j >= 0; j--)
        {
            if (nums[j] < nums[j + 1]) {
                i = j;
                break;
            }
        }

        if (i == -1) {
            this.reverse(nums, 0, nums.length - 1);
        } else {
            int j = i;
            int max = Integer.MAX_VALUE;
            for (int k = i+1; k < nums.length && nums[k] > nums[i]; k++)
            {
                if (nums[k] > nums[i] && nums[k] < max) {
                    max = nums[k];
                    j = k;
                }
            }
            this.swap(nums, i, j);
            Arrays.sort(nums, i+1, nums.length);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i < nums.length && j < nums.length && i > 0 && j > 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
