package com.lzhao.leetcode._201_240._219_containsDuplicate2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (i - j <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
