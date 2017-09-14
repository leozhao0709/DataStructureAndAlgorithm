package com.lzhao.leetcode._241_280._258_addDigits;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num/10;
            }
            num = sum;
        }

        return num;
    }
}
