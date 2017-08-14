package com.lzhao.leetcode._041_080._048_rotateImage;

/**
 * Created by lzhao on 8/13/17.
 */

class Solution {

    void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i <= n/2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }

}
