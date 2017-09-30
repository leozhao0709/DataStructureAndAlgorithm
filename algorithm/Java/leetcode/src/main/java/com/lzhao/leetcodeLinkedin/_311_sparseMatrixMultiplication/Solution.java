package com.lzhao.leetcodeLinkedin._311_sparseMatrixMultiplication;

/**
 * Created by lzhao on 9/29/17.
 */

class Solution {

    int[][] multiply(int[][] A, int[][] B) {
        int aLength = A.length;

        if (A.length==0 || B.length == 0) {
            return new int[0][0];
        }
        int[][] res = new int[aLength][B[0].length];


        for (int i = 0; i < aLength; i++)
        {
            for (int j = 0; j < A[0].length; j++)
            {
                if (A[i][j] != 0) {
                    for (int k = 0; k < B[0].length; k++)
                    {
                        if (B[j][k] != 0) {
                            res[i][k] += A[i][j] * B[j][k];
                        }
                    }
                }
            }
        }

        return res;
    }
}
