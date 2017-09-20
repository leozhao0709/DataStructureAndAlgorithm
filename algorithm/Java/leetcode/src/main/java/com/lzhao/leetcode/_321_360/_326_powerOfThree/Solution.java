package com.lzhao.leetcode._321_360._326_powerOfThree;

/**
 * Created by lzhao on 9/19/17.
 */

class Solution {

    boolean isPowerOfThree(int n) {
        if (n > 1) {
            while (n % 3 == 0) {
                n = n/3;
            }
        }

        return n==1;
    }
}
