package com.lzhao.leetcode._161_200._191_numbersOf1Bits;

/**
 * Created by lzhao on 9/7/17.
 */

class Solution {

    int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++)
        {
            if ((n & 1) == 1) {
                res++;
            }
            n = n>>1;
        }

        return res;
    }
}
