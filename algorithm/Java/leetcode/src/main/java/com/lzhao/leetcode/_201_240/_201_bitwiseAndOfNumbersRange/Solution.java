package com.lzhao.leetcode._201_240._201_bitwiseAndOfNumbersRange;

/**
 * Created by lzhao on 9/8/17.
 */

class Solution {
    int rangeBitwiseAnd(int m, int n) {
        int i = 0;

        while (m != n) {
            m = m >> 1;
            n = n >> 1;
            i++;
        }

        return m << i;
    }
}
