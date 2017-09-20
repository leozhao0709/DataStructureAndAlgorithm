package com.lzhao.leetcode._281_320._313_superUglyNumber;

/**
 * Created by lzhao on 9/19/17.
 */

class Solution {

    int nthSuperUglyNumber(int n, int[] primes) {
        if (n == 1) {
            return 1;
        }

        int[] array = new int[n];
        array[0] = 1;
        int[] primesPoint = new int[primes.length];

        for (int i = 1; i < n; i++)
        {
            array[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++)
            {
                array[i] = Math.min(array[i], array[primesPoint[j]] * primes[j]);
            }
            for (int j = 0; j < primes.length; j++)
            {
                if (array[i] == array[primesPoint[j]] * primes[j]) {
                    primesPoint[j]++;
                }
            }
        }

        return array[n-1];
    }
}
