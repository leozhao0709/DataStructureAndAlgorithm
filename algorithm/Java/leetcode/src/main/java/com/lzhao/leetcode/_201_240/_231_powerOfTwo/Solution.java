package com.lzhao.leetcode._201_240._231_powerOfTwo;

/**
 * Created by lzhao on 9/12/17.
 */

class Solution {

    boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & Integer.highestOneBit(n)) == n;
    }
}
