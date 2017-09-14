package com.lzhao.leetcode._241_280._263_uglyNumber;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    boolean isUgly(int num) {

        if (num <= 0) {
            return false;
        }

        while (num > 1) {
            if (num % 5 == 0) {
                num /= 5;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 2 == 0) {
                num /= 2;
            } else {
                return false;
            }
        }

        return true;
    }
}
