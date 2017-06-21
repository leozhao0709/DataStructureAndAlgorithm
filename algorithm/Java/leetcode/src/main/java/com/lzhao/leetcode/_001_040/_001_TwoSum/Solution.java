package com.lzhao.leetcode._001_040._001_TwoSum;

import java.util.HashMap;

/**
 * Created by lzhao on 6/20/17.
 */

class Solution {

    public int[] twoSum(int[] nums, int target) throws Exception {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            int currentValue = nums[i];

            if(numsMap.containsKey(target - currentValue))
            {
                if(i > numsMap.get(target - currentValue))
                {
                    return new int[]{numsMap.get(target - currentValue), i};
                }
                else {
                    return new int[]{i, numsMap.get(target - currentValue)};
                }
            }

            numsMap.put(currentValue, i);
        }

        throw new Exception("Not find");
    }
}
