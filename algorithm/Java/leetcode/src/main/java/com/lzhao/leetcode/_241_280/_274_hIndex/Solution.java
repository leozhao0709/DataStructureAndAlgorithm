package com.lzhao.leetcode._241_280._274_hIndex;

import java.util.Arrays;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    int hIndex(int[] citations) {
        
        if (citations.length == 0) {
            return 0;
        }
        
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++)
        {
            if (citations.length - i <= citations[i]) {
                return citations.length - i;
            }
        }

        return 0;
    }
}
