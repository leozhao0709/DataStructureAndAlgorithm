package com.lzhao.leetcode._041_080._069_sqrt;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {

    int mySqrt(int x) {

        int start = 1;

        return this.binarySearchSqrt(start, x, x);
    }

    private int binarySearchSqrt(int start, int end, int target) {
        if (start > end) {
            return end;
        }

        int mid = start + (end-start)/2;

        if (mid == target/mid) {
            return mid;
        } else if (mid < target/mid) {
            return binarySearchSqrt(mid+1, end, target);
        } else {
            return binarySearchSqrt(start, mid-1, target);
        }
    }
}
