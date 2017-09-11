package com.lzhao.leetcode._201_240._217_containsDuplicate;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
