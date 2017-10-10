package com.lzhao.leetcodeAmazon._167_twoSum2;

/**
 * Created by lzhao on 10/10/17.
 */

class Solution {

    int[] twoSum(int[] numbers, int target) {
        int i = 0, j=numbers.length-1;

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] {i+1, j+1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }

        return null;
    }
}
