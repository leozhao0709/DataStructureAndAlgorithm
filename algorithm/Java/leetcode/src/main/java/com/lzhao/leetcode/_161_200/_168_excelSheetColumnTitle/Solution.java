package com.lzhao.leetcode._161_200._168_excelSheetColumnTitle;

/**
 * Created by lzhao on 9/4/17.
 */

class Solution {
    String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n = n-1;
            int i = n % 26;
            char curr = (char) (65+i);
            sb.append(curr);
            n = n/26;
        }

        return sb.reverse().toString();
    }
}
