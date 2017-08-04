package com.lzhao.leetcode._001_040._007_ReverseInteger;

/**
 * Created by lzhao on 8/3/17.
 */

class Solution {

    int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int y = x % 10;
            int oldResult = result;
            result = result * 10 + y;

            if ((result - y) / 10 != oldResult ) {
                return 0;
            }
            x = x / 10;
        }

        return result;
    }
}
