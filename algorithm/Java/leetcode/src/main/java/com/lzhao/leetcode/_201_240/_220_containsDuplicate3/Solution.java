package com.lzhao.leetcode._201_240._220_containsDuplicate3;

import java.util.TreeSet;

/**
 * Created by lzhao on 9/10/17.
 */

@SuppressWarnings("Since15")
class Solution {

    boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<Long>();

        for (int i = 0; i < nums.length; i++) {
            long curr = (long) nums[i];

            Long floor = set.floor(curr);
            Long ceil = set.ceiling(curr);

            if (floor != null && curr - floor <= t) {
                return true;
            }

            if (ceil != null && ceil - curr <= t) {
                return true;
            }

            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i-k]);
            }
        }

        return false;
    }
}
