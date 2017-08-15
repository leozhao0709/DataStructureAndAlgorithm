package com.lzhao.leetcode._041_080._060_permutationSequence;


import java.util.Arrays;

/**
 * Created by lzhao on 8/14/17.
 */

class Solution {

    String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n ; i++) {
            nums[i-1] = i;
        }

        int i = 1;
        while (i < k) {
            this.nextPermutation(nums);
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return sb.toString();
    }

    private void nextPermutation(int[] nums) {
        int i = -1;

        for (int j = nums.length - 2; j >= 0; j--)
        {
            if (nums[j] < nums[j + 1]) {
                i = j;
                break;
            }
        }

        int j = i;
        int max = Integer.MAX_VALUE;
        for (int k = i+1; k < nums.length; k++)
        {
            if (nums[k] > nums[i] && nums[k] < max) {
                max = nums[k];
                j = k;
            }
        }
        this.swap(nums, i, j);
        Arrays.sort(nums, i+1, nums.length);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
