package com.lzhao.leetcode._281_320._319_bulbSwitcher;

/**
 * Created by lzhao on 9/19/17.
 */

class Solution {

    int bulbSwitch(int n) {
        int count = 0;

        for (int i = 1; i*i <= n; i++)
        {
            count++;
        }

        return count;
    }
}
