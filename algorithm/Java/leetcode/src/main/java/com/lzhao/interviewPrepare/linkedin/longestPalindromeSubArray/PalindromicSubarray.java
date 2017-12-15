package com.lzhao.interviewPrepare.linkedin.longestPalindromeSubArray;

/**
 * Created by lzhao on 11/27/17.
 */

class PalindromicSubarray {

    int[] longestPalindromic(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        boolean[][] table = new boolean[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            table[i][i] = true;

            if (i != arr.length-1 && arr[i] == arr[i+1]) {
                table[i][i+1] = true;
            }
        }

        int start = 0;
        int end = 0;

        for (int i = arr.length-1; i >= 0; i--)
        {
            for (int j = i+2; j < arr.length; j++)
            {
                if (table[i+1][j-1] && arr[i] == arr[j]) {
                    table[i][j] = true;
                }

                if (table[i][j]) {
                    if (j - i > end - start) {
                        end = j;
                        start = i;
                    }
                }
            }
        }

        int[] res = new int[end-start+1];

        System.arraycopy(arr, start, res, 0, res.length);

        return res;
    }
}
