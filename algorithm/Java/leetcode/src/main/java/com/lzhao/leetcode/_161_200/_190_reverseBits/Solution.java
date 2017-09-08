package com.lzhao.leetcode._161_200._190_reverseBits;

/**
 * Created by lzhao on 9/7/17.
 */

class Solution {

    int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++)
        {
            int lastBit = n & 1;
            res = res << 1 | lastBit;
            n = n >>1;
        }

        return res;
    }
}
