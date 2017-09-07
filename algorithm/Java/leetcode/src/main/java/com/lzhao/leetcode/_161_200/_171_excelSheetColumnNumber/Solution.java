package com.lzhao.leetcode._161_200._171_excelSheetColumnNumber;

/**
 * Created by lzhao on 9/6/17.
 */

class Solution {
    int titleToNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        int res = 0;
        int j = 0;
        for (int i = sb.length()-1; i >= 0; i--)
        {
            char curr = sb.charAt(i);
            res += Math.pow(26, j) * (curr + 1 - 65);
            j++;
        }

        return res;
    }
}
