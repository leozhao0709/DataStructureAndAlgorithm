package com.lzhao.leetcode._001_040._022_GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 8/6/17.
 */

class Solution {


    List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        this.helper(n, 0, "", result);
        return result;
    }

    private void helper(int left, int right, String temp, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(temp);
            return;
        }

        if (left > 0) {
            this.helper(left - 1, right + 1, temp + "(", result);
        }

        if (right > 0) {
            this.helper(left, right - 1, temp + ")", result);
        }
    }
}
