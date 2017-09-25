package com.lzhao.leetcodeLinkedin._034_searchForARange;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {

    int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};

        int i = this.binarySearch(nums, 0, nums.length-1, target);

        if (i != -1) {
            int j = i, k = i;

            while (j != -1) {
                res[0] = j;
                j = this.binarySearch(nums, 0, j-1, target);
            }

            while (k != -1) {
                res[1] = k;
                k = this.binarySearch(nums, k+1, nums.length-1, target);
            }
        }

        return res;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return this.binarySearch(nums, mid+1, end, target);
        } else {
            return this.binarySearch(nums, start, mid-1, target);
        }
    }
}
