package com.lzhao.leetcodeAmazon._001_twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
