package com.lzhao.interviewPrepare.linkedin.longestPalindromeSubset;

import java.util.Arrays;

/**
 * Created by lzhao on 11/27/17.
 */

class PalindormicSubset {

    int longestPalindromic(int[] arr) {
        if (arr.length < 2) {
            return arr.length;
        }

        // f(i, j) = f(i+1, j-1) + 2 if arr[i] == arr[j]
        //         = max(f(i+1, j), f(i, j-1)) if arr[i] != arr[j]

        int[][] table = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            table[i][i] = 1;

            if (i != arr.length-1 && arr[i] == arr[i+1]) {
                table[i][i+1] = 2;
            } else if (i != arr.length-1 && arr[i] != arr[i+1]) {
                table[i][i+1] = 1;
            }
        }

        for (int i = arr.length-1; i >= 0 ; i--)
        {
            for (int j = i+2; j < arr.length; j++)
            {
                if (arr[i] == arr[j]) {
                    table[i][j] = table[i+1][j-1] + 2;
                } else {
                    table[i][j] = Math.max(table[i+1][j], table[i][j-1]);
                }

            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        return table[0][arr.length-1];

    }
}
