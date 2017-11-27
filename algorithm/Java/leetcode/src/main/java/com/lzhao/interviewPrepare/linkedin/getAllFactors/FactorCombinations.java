package com.lzhao.interviewPrepare.linkedin.getAllFactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 11/25/17.
 */

class FactorCombinations {
    
    List<List<Integer>> getAllCombinations(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        this.helper(2, n, new ArrayList<Integer>(), res);
        return res;
    }

    private void helper(int start, int n, ArrayList<Integer> curr, List<List<Integer>> res) {
        if (n == 1) {
            if (curr.size() == 1) {
                return;
            }
            res.add(new ArrayList<Integer>(curr));
            return;
        }

        for (int i = start; i <= n ; i++)
        {
            if (n % i == 0) {
                curr.add(i);
                this.helper(i, n/i, curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }
}
