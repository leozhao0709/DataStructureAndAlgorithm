package com.lzhao.leetcode._041_080._063_uniquePaths2;

/**
 * Created by lzhao on 8/15/17.
 */

class Solution {

    int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) {
            return 1;
        }

        int n = obstacleGrid[0].length;

        int[][] table = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                for (int j = i; j < m; j++) {
                    table[j][0] = 0;
                }
                break;
            }
            table[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                for (int j = i; j < n; j++) {
                    table[0][j] = 0;
                }
                break;
            }
            table[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    table[i][j] = 0;
                    continue;
                }
                table[i][j] = table[i-1][j] + table[i][j-1];
            }
        }

        return table[m-1][n-1];
    }

}
