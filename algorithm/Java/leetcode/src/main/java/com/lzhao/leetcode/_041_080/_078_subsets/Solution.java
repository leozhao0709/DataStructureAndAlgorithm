package com.lzhao.leetcode._041_080._078_subsets;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/17/17.
 */

class Solution {

    private List<List<Integer>> result = new LinkedList<List<Integer>>();

    List<List<Integer>> subsets(int[] nums) {

        // refer leetcode 77, here k can be nums.length
        for (int i = 0; i <= nums.length; i++)
        {
            this.combination(nums, 0, nums.length-1, i, new LinkedList<Integer>());
        }

        return this.result;
    }

    // search from start to end of nums to get k elements combinations
    private void combination(int[] nums, int start, int end, int k, List<Integer> integers) {
        if (k<=0) {
            this.result.add(integers);
            return;
        }

        for (int i = start; i <= end; i++)
        {
            List<Integer> temp = new LinkedList<Integer>(integers);
            temp.add(nums[i]);
            this.combination(nums, i+1, end, k-1, temp);
        }
    }
}
