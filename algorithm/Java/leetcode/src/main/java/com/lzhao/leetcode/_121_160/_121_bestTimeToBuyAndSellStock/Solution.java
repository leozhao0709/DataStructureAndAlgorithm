package com.lzhao.leetcode._121_160._121_bestTimeToBuyAndSellStock;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(prices[i]-min, max);
            }
        }

        return max;
    }

}
