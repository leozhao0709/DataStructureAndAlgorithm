package com.lzhao.leetcodeAmazon._078_subsets;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 10/5/17.
 */

class Solution {

    List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        for (int i = 0; i <= nums.length; i++) {
            this.helper(nums, 0, nums.length-1, i, new LinkedList<Integer>(), res);
        }

        return res;
    }

    private void helper(int[] nums, int start, int end, int k, List<Integer> integers, List<List<Integer>> res) {

        if (k == 0) {
            res.add(integers);
            return;
        }

        if (start > end) {
            return;
        }

        for (int i = start; i <= end; i++) {
            List<Integer> temp = new LinkedList<Integer>(integers);
            temp.add(nums[i]);
            this.helper(nums, i+1, end, k-1, temp, res);
        }
    }

}
