package com.lzhao.leetcode._041_080._066_plusOne;

/**
 * Created by lzhao on 8/15/17.
 */

class Solution {

    int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        // find the first index which is not 9
        while (i>=0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }

        if (i < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);

            return result;
        } else {
            digits[i] += 1;
            return digits;
        }
    }
}
