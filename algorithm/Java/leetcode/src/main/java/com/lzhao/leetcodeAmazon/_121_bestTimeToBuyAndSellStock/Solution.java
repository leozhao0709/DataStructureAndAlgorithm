package com.lzhao.leetcodeAmazon._121_bestTimeToBuyAndSellStock;

/**
 * Created by lzhao on 10/7/17.
 */

class Solution {

    int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int res = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] > min) {
                res = Math.max(res, prices[i] - min);
            } else {
                min = prices[i];
            }
        }

        return res;
    }
}
