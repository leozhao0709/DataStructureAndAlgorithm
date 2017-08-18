package com.lzhao.leetcode._041_080._077_combinations;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {
    private List<List<Integer>> result = new LinkedList<List<Integer>>();

    List<List<Integer>> combine(int n, int k) {

        this.combine(1, n, k, new LinkedList<Integer>());

        return this.result;
    }

    private void combine(int start, int end, int k, List<Integer> integers) {
        if (k <= 0) {
            this.result.add(integers);
            return;
        }

        for (int i = start; i <= end; i++)
        {
            List<Integer> temp = new LinkedList<Integer>(integers);
            temp.add(i);
            this.combine(i+1, end, k-1, temp);
        }
    }
}
