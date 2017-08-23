package com.lzhao.leetcode._121_160._122_bestTimeToBuyAndSellStock2;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[i-1]) {
                max += prices[i] - prices[i-1];
            }
        }

        return max;

    }

}
