package com.lzhao.leetcode._281_320._304_rangeSumQuery2d;

/**
 * Created by lzhao on 9/18/17.
 */

class NumMatrix {

    private int[][] dp;

    public NumMatrix(int[][] matrix) {
        if (matrix.length > 0) {
            this.dp = new int[matrix.length+1][matrix[0].length+1];

            for (int i = 1; i < matrix.length+1; i++)
            {
                for (int j = 1; j < matrix[0].length+1; j++)
                {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1]+matrix[i-1][j-1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return dp[row2+1][col2+1] - dp[row2+1][col1+1-1] - (dp[row1+1-1][col2+1] - dp[row1+1-1][col1+1-1]);
    }
}
