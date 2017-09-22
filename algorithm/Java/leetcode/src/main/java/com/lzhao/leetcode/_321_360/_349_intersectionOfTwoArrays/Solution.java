package com.lzhao.leetcode._321_360._349_intersectionOfTwoArrays;

import java.util.*;

/**
 * Created by lzhao on 9/20/17.
 */

class Solution {

    int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        int[] res = new int[set2.size()];

        int i = 0;
        for(int value: set2) {
            res[i++] = value;
        }

        return res;
    }
}
