package com.lzhao.leetcode._121_160._131_palindromePartitioning;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/25/17.
 */

class Solution {

    private List<List<String>> res = new LinkedList<List<String>>();

    List<List<String>> partition(String s) {
        if (s.length() == 0) {
            return res;
        }

        this.helper(s, 0, s.length()-1, new LinkedList<String>());

        return res;
    }

    private void helper(String s, int left, int right, List<String> subRes) {
        if (left > right) {
            this.res.add(subRes);
            return;
        }

        for (int i = left+1; i <= right+1; i++) {
            String subStr = s.substring(left, i);

            if (this.isPalindorme(subStr)) {
                List<String> temp = new LinkedList<String>(subRes);
                temp.add(subStr);
                this.helper(s, i, right, temp);
            }
        }
    }

    private boolean isPalindorme(String s) {
        if (s.length() == 0) {
            return true;
        }

        int from = 0;
        int end = s.length() - 1;

        while (from < end) {
            if (s.charAt(from++) != s.charAt(end--)) {
                return false;
            }
        }

        return true;
    }
}
