package com.lzhao.leetcodeAmazon._204_countPrimes;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    int countPrimes(int n) {
        int[] arr = new int[n];

        for (int i = 2; i < Math.ceil(n/2.0); i++)
        {
            if (arr[i] == 0) {
                for (int j = 2; j*i < n; j++)
                {
                    arr[j*i] = 1;
                }
            }
        }

        int res = 0;

        for (int i = 2; i < n; i++)
        {
            if (arr[i] == 0) {
                res++;
            }
        }

        return res;
    }
}
