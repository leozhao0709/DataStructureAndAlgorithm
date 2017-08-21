package com.lzhao.leetcode._081_120._096_uniqueBinarySearchTrees;

/**
 * Created by lzhao on 8/20/17.
 */

class Solution {

    int numTrees(int n) {

//        if (n == 0 || n==1) {
//            return 1;
//        }
//
//        int sum = 0;
//        for (int i = 1; i <=n; i++) {
//            sum += numTrees(i-1) * numTrees(n-i);
//        }
//
//        return sum;

        int[] count = new int[n+1];
        count[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int root = 1; root <= i; root++) {
                int left = count[root-1];
                int right = count[i-root];
                count[i] += left*right;
            }
        }
        return count[n];
    }
}
