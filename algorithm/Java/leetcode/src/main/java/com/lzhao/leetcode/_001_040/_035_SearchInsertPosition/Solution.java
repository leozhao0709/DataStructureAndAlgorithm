package com.lzhao.leetcode._001_040._035_SearchInsertPosition;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    int searchInsert(int[] nums, int target) {

//        for (int i = 0; i < nums.length; i++)
//        {
//            if (nums[i] >= target) {
//                return i;
//            }
//        }
//
//        return nums.length;

        int i = this.binarySearchInsert(nums, 0, nums.length - 1, target);

        if (nums[i] < target) {
            return i+1;
        }  else {
            return i;
        }
    }

    private int binarySearchInsert(int[] nums, int i, int j, int target) {
        if (i > j) {
            if (i < nums.length) {
                return i;
            } else {
                return j;
            }
        }

        int mid = (i+j)/2;

        if (nums[mid] < target) {
            return this.binarySearchInsert(nums, mid+1, j, target);
        } else {
            return this.binarySearchInsert(nums, i, mid-1, target);
        }
    }

}
