package com.lzhao.leetcode._001_040._039_CombinationSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        return result;
    }

    void helper(int[] candidates, int i, int j, int target, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }

        for (int k = i; k <=j; k++)
        {
            int curr = candidates[k];

        }
    }
}
