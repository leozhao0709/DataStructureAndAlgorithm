package com.lzhao.leetcode._081_120._120_triangle;

import java.util.List;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    int minimumTotal(List<List<Integer>> triangle) {

        if (triangle.size() == 0) {
            return 0;
        }

        int[] dp = new int[triangle.size()];

        dp[0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++)
        {
            for (int j = triangle.get(i).size()-1; j >= 0; j--)
            {
                if (j == 0) {
                    dp[j] = dp[0] + triangle.get(i).get(0);
                } else if (j == triangle.get(i).size()-1) {
                    dp[j] = dp[j-1] + triangle.get(i).get(triangle.get(i).size()-1);
                } else {
                    dp[j] = triangle.get(i).get(j) + Math.min(dp[j-1], dp[j]);
                }
            }
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < dp.length; i++)
        {
            if (dp[i] < res) {
                res = dp[i];
            }
        }

        return res;
    }
}
