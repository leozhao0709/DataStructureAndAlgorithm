package com.lzhao.leetcode._001_040._040_combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        this.helper(candidates, 0, candidates.length-1, target, new ArrayList<Integer>());

        return result;
    }

    private void helper(int[] candidates, int i, int j, int target, List<Integer> temp) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            this.result.add(temp);
            return;
        }

        for (int k = i; k <= j; k++) {
            int curr = candidates[k];
            if (k != i && curr == candidates[k - 1]) {
                continue;
            }

            List<Integer> tempArr = new ArrayList<Integer>(temp);
            tempArr.add(curr);
            this.helper(candidates, k+1, j, target-curr, tempArr);
        }
    }

}
