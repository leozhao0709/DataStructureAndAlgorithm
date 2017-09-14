package com.lzhao.leetcode._241_280._264_uglyNumber2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    int nthUglyNumber(int n) {
        List<Integer> list = new LinkedList<Integer>();
        int i2 = 0;
        int i5 = 0;
        int i3 = 0;

        list.add(1);

        int count = 1;
        while (count < n) {
            int current = Math.min(list.get(i2)*2, Math.min(list.get(i3)*3, list.get(i5)*5));
            list.add(current);
            count++;
            if (current == list.get(i2)*2) {
                i2++;
            }
            if (current == list.get(i3)*3) {
                i3++;
            }
            if (current == list.get(i5)*5) {
                i5++;
            }
        }

        return list.get(n-1);
    }
}
