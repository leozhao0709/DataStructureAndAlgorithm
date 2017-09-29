package com.lzhao.leetcodeLinkedin._254_factorCombinations;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/28/17.
 */

class Solution {

    private List<List<Integer>> res = new LinkedList<List<Integer>>();

    List<List<Integer>> getFactors(int n) {
        this.helper(n, 2, new LinkedList<Integer>());
        return this.res;
    }

    private void helper(int n, int start, List<Integer> integers) {
        if (n == 1) {
            if (integers.size() > 1) {
                this.res.add(integers);
            }
            return;
        }

        for (int i = start; i <= n; i++) {
            if (n % i == 0) {
                List<Integer> temp = new LinkedList<Integer>(integers);
                temp.add(i);
                this.helper(n/i, i, temp);
            }
        }
    }
}
