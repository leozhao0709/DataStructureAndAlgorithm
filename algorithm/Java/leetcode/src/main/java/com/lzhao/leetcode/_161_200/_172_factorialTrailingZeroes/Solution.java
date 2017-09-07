package com.lzhao.leetcode._161_200._172_factorialTrailingZeroes;

/**
 * Created by lzhao on 9/6/17.
 */

class Solution {

    int trailingZeroes(int n) {
        int res = 0;

        while (n > 0) {
            res += n / 5;
            n = n/5;
        }

        return res;
    }
}
