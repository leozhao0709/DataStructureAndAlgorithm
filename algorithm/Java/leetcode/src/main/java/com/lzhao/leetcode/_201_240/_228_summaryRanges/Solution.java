package com.lzhao.leetcode._201_240._228_summaryRanges;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/11/17.
 */

class Solution {

    List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<String>();

        if (nums.length == 0) {
            return res;
        }

        if (nums.length == 1) {
            res.add(String.valueOf(nums[0]));
        }

        int start = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] - nums[i-1] != 1) {
                if (nums[i-1] == start) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(String.valueOf(start) + "->" + String.valueOf(nums[i-1]));
                }
                start = nums[i];
            }
            if (i == nums.length-1) {
                if (nums[i] - nums[i-1] == 1) {
                    res.add(String.valueOf(start) + "->" + String.valueOf(nums[i]));
                } else {
                    res.add(String.valueOf(nums[i]));
                }
            }
        }

        return res;
    }
}
