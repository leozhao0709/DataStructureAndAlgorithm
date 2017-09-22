package com.lzhao.leetcode._321_360._342_powerOfFour;

/**
 * Created by lzhao on 9/20/17.
 */

class Solution {

    boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        }

        while (num > 1) {
            if (num%4 == 0) {
                num /= 4;
            } else {
                return false;
            }
        }

        return true;
    }
}
