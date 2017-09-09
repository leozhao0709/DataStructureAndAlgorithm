package com.lzhao.leetcode._201_240._202_happyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lzhao on 9/8/17.
 */

class Solution {
    boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();

        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += (n%10) * (n%10);
                n = n/10;
            }
            n = sum;

            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }

        return true;
    }
}
