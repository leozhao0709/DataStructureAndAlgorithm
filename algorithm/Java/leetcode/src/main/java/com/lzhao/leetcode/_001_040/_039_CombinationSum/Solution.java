package com.lzhao.leetcode._001_040._039_CombinationSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.helper(candidates, 0, candidates.length-1, target, new ArrayList<Integer>());
        return result;
    }

    private void helper(int[] candidates, int i, int j, int target, List<Integer> currentResult) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.addAll(currentResult);
            result.add(temp);
            return;
        }

        for (int k = i; k <=j; k++)
        {
            int curr = candidates[k];
            List<Integer> temp = new ArrayList<Integer>(currentResult);
            temp.add(curr);
            this.helper(candidates, k, j, target-curr, temp);
        }
    }
}
