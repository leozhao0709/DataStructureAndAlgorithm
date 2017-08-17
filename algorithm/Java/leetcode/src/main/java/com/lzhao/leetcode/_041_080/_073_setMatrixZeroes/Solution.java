package com.lzhao.leetcode._041_080._073_setMatrixZeroes;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {

    void setZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++)
        {
            if (row[i]) {
                for (int j = 0; j < n; j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (col[i]) {
                for (int j = 0; j < m; j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }
    }

}
