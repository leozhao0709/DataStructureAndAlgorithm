package com.lzhao.leetcode._001_040._033_searchInRotatedSortedArray;

/**
 * Created by lzhao on 8/9/17.
 */

class Solution {

    int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int i, int j, int target) {
        if (i > j) {
            return -1;
        }
        
        int mid = (i+j)/2;
        if (nums[mid] == target) {
            return mid;
        }

        // left i to mid is in order ascending
        if (nums[i] <= nums[mid]) {
            if (target >= nums[i] && target < nums[mid]) {
                return this.binarySearch(nums, i, mid - 1, target);
            } else {
                return this.search(nums, mid+1, j, target);
            }
        } else {
            if (target > nums[mid] && target <= nums[j]) {
                return this.binarySearch(nums, mid + 1, j, target);
            } else {
                return this.search(nums, i, mid - 1, target);
            }
        }
    }

    private int binarySearch(int[] nums, int i, int j, int target) {
        if (i > j) {
            return -1;
        }

        int mid = (i + j) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return this.binarySearch(nums, mid+1, j, target);
        } else {
            return this.binarySearch(nums, i, mid-1, target);
        }
    }
}
