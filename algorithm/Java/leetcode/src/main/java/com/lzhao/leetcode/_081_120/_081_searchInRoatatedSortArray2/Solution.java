package com.lzhao.leetcode._081_120._081_searchInRoatatedSortArray2;

/**
 * Created by lzhao on 8/18/17.
 */

class Solution {

    boolean search(int[] nums, int target) {

        return this.search(nums, 0, nums.length-1, target);
    }

    private boolean search(int[] nums, int left, int right, int target) {
        if (left > right) {
            return false;
        }

        int mid = left + (right-left)/2;

        if (nums[mid] == target) {
            return true;
        }

        if (nums[mid] < target) {
            if (nums[left] < nums[mid]) {
                return this.search(nums, mid+1, right, target);
            } else {
                return this.search(nums, mid+1, right, target) || this.search(nums, left, mid-1, target);
            }
        } else {
            if (nums[left] > nums[mid]) {
                return this.search(nums, left, mid-1, target);
            } else {
                return this.search(nums, mid+1, right, target) || this.search(nums, left, mid-1, target);
            }
        }


    }
}
