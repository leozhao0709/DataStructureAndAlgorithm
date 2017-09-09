package com.lzhao.leetcode._201_240._204_countPrimes;

/**
 * Created by lzhao on 9/9/17.
 */

class Solution {
    int countPrimes(int n) {
        int[] arr = new int[n];
        for (int i = 2; i < n; i++)
        {
            if (arr[i] == 0) {
                int j = 2;
                int temp = i*j;
                while (temp < n) {
                    arr[temp] = 1;
                    j++;
                    temp = i*j;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++)
        {
            if (arr[i] == 0) {
                count++;
            }
        }

        return count;
    }
}
