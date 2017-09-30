package com.lzhao.leetcodeLinkedin._367_validPerfectSqure;

/**
 * Created by lzhao on 9/29/17.
 */

class Solution {

    boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num <= 1) {
            return true;
        }
        return this.helper(1, num/2, num);
    }

    private boolean helper(long start, long end, int target) {
        if (start > end) {
            return false;
        }

        long mid = start+(end-start)/2;
        if (mid * mid == target) {
            return true;
        } else if (mid * mid < target) {
            return this.helper(mid+1, end, target);
        } else {
            return this.helper(start, mid-1, target);
        }
    }
}
