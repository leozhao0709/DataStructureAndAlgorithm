package com.lzhao.leetcode._041_080._070_climbingStairs;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {

    int climbStairs(int n) {
        int[] steps = new int[n+1];

        steps[1] = 1;

        if (n >= 2) {
            steps[2] = 2;

            for (int i = 3; i < n+1; i++)
            {
                steps[i] = steps[i-1] + steps[i-2];
            }
        }

        return steps[n];
    }
}
