package com.lzhao.leetcode._121_160._134_gasStation;

/**
 * Created by lzhao on 8/25/17.
 */

class Solution {

    int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int total = 0;

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
        }

        if (total < 0) {
            return -1;
        }

        int tank = 0;
        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                tank = 0;
                startIndex = i+1;
            }
        }

        return startIndex;
    }
}
