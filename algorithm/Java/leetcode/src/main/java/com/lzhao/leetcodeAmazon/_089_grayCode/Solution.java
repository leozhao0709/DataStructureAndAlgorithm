package com.lzhao.leetcodeAmazon._089_grayCode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 10/5/17.
 */

class Solution {

    List<Integer> grayCode(int n) {
        List<Integer> res = new LinkedList<Integer>();

        if (n == 0) {
            res.add(0);
        }

        if (n >= 1) {
            res.add(0);
            res.add(1);
        }

        for (int i = 2; i <= n; i++) {
            int highestBit = 1 << i-1;
            int size = res.size();
            for (int j = size-1; j >= 0; j--) {
                res.add(highestBit+res.get(j));
            }
        }

        return res;
    }
}
