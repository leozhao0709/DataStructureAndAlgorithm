package com.lzhao.leetcode._041_080._059_spiralMatrix2;

/**
 * Created by lzhao on 8/14/17.
 */

class Solution {

    private int curr = 1;

    int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;

        this.generateMatrix(result, rowBegin, rowEnd, colBegin, colEnd);

        return result;
    }

    private void generateMatrix(int[][] table, int rowBegin, int rowEnd, int colBegin, int colEnd) {
        
        if (rowBegin > rowEnd || colBegin > colEnd) {
            return;
        }

        // top most row
        for (int i = colBegin; i <= colEnd; i++) {
            table[rowBegin][i] = curr++;
        }
        rowBegin++;

        // right most col
        for (int i = rowBegin; i <= rowEnd ; i++) {
            table[i][colEnd] = curr++;
        }
        colEnd--;

        // bottom most row
        if (rowBegin <= rowEnd) {
            for (int i = colEnd; i >=colBegin ; i--) {
                table[rowEnd][i] = curr++;
            }
            rowEnd--;
        }

        // left most col
        if (colBegin <= colEnd) {
            for (int i = rowEnd; i >= rowBegin ; i--) {
                table[i][colBegin] = curr++;
            }
            colBegin++;
        }

        this.generateMatrix(table, rowBegin, rowEnd, colBegin, colEnd);
    }
}
