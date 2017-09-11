package com.lzhao.leetcode._201_240._216_combinationSum3;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    private List<List<Integer>> res = new LinkedList<List<Integer>>();

    List<List<Integer>> combinationSum3(int k, int n) {
        this.helper(k, 1, 9 , n, new LinkedList<Integer>());
        return this.res;
    }

    private void helper(int k, int start, int end, int n, List<Integer> list) {
        if (k == 0) {
            if (n == 0) {
                this.res.add(list);
            }
            return;
        }

        if (start > end) {
            return;
        }

        for (int i = start; i <= end ; i++)
        {
            List<Integer> temp = new LinkedList<Integer>(list);
            temp.add(i);
            this.helper(k-1, i+1, 9, n-i, temp);
        }
    }
}
