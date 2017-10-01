package com.lzhao.leetcodeLinkedin._633_sumOfSquareNumbers;

/**
 * Created by lzhao on 9/30/17.
 */

class Solution {

    boolean judgeSquareSum(int c) {
        for (long i = 0; i*i <= c; i++) {
            int b = c-(int) (i*i);
            if (this.helper(0, b, b)) {
                return true;
            }
        }

        return false;
    }

    private boolean helper(long start, long end, int target) {
        if (start > end) {
            return false;
        }

        long mid = start + (end-start)/2;
        if (mid * mid == target) {
            return true;
        } else if (mid * mid < target) {
            return this.helper(mid+1, end, target);
        } else {
            return this.helper(start, mid-1, target);
        }
    }

}
