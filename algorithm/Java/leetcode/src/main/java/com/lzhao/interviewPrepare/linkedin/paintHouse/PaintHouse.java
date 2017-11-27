package com.lzhao.interviewPrepare.linkedin.paintHouse;

/**
 * Created by lzhao on 11/25/17.
 */

class PaintHouse {

    int minCost(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }

        int preMin = 0;
        int preSecondMin = 0;
        int preMinIndex = -1;

        for (int i = 0; i < costs.length; i++)
        {
            int currMin = Integer.MAX_VALUE;
            int currSecondMin = Integer.MAX_VALUE;
            int currMinIndex = -1;
            for (int j = 0; j < costs[0].length; j++)
            {
                if (j == preMinIndex) {
                    costs[i][j] += preSecondMin;
                } else {
                    costs[i][j] += preMin;
                }

                if (costs[i][j] < currMin) {
                    currSecondMin = currMin;
                    currMin = costs[i][j];
                    currMinIndex = j;
                } else if (costs[i][j] < currSecondMin) {
                    currSecondMin = costs[i][j];
                }
            }

            preMin = currMin;
            preSecondMin = currSecondMin;
            preMinIndex = currMinIndex;
        }

        int res = costs[costs.length-1][0];
        for (int i = 1; i < costs[0].length; i++)
        {
            res = Math.min(res, costs[costs.length-1][i]);
        }

        return res;
    }
}
