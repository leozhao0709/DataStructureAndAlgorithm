package com.lzhao.interviewPrepare.linkedin.combinationOfSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 11/23/17.
 */

class CombinationOfSum {

    List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        this.helper(candidates, 0, candidates.length-1, target, new ArrayList<Integer>(), res);
        return res;
    }

//    private void helper(int[] candidates, int start, int end, int target, ArrayList<Integer> curr, List<List<Integer>> res) {
//        if (target == 0) {
//            res.add(curr);
//            return;
//        }
//
//        for (int i = start; i <= end; i++)
//        {
//            if (i != start && candidates[i] == candidates[i-1]) {
//                continue;
//            }
//            ArrayList<Integer> temp = new ArrayList<Integer>(curr);
//            temp.add(candidates[i]);
//            this.helper(candidates, i+1, end, target-candidates[i], temp, res);
//        }
//    }

    private void helper(int[] candidates, int start, int end, int target, ArrayList<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(curr));
            return;
        }

        for (int i = start; i <= end; i++)
        {
            if (i != start && candidates[i] == candidates[i-1]) {
                continue;
            }
            curr.add(candidates[i]);
            this.helper(candidates, i+1, end, target-candidates[i], curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
