package com.lzhao.leetcode._001_040._034_searchForARange;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};

        int i = this.binarySearch(nums, 0, nums.length - 1, target);

        int j = i, k = i;

        while (j != -1) {
            result[0] = j;
            j = this.binarySearch(nums, 0, j - 1, target);
        }

        while (k != -1) {
            result[1] = k;
            k = this.binarySearch(nums, k+1, nums.length-1, target);
        }

        return result;
    }

    private int binarySearch(int[] nums, int i, int j, int target) {
        if (i > j) {
            return -1;
        }

        int mid = (i+j)/2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return binarySearch(nums, i, mid - 1, target);
        } else {
            return binarySearch(nums, mid+1, j, target);
        }
    }
}
