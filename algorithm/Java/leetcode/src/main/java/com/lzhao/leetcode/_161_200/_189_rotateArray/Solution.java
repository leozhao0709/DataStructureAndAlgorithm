package com.lzhao.leetcode._161_200._189_rotateArray;

/**
 * Created by lzhao on 9/7/17.
 */

class Solution {
    // 三次翻转 (X`Y`)` = YX
    void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k%n;

        this.reverse(nums, 0, n-k-1);
        this.reverse(nums, n-k, n - 1);
        this.reverse(nums, 0, n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
