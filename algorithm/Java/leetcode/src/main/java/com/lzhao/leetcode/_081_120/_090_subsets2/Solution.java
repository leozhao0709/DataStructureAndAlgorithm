package com.lzhao.leetcode._081_120._090_subsets2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/19/17.
 */

class Solution {

    private List<List<Integer>> result = new LinkedList<List<Integer>>();

    List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            this.subsetsWithDup(nums, i, 0, nums.length-1, new LinkedList<Integer>());
        }

        return this.result;
    }

    private void subsetsWithDup(int[] nums, int k, int left, int right, List<Integer> integers) {
        if (k <= 0) {
            this.result.add(integers);
            return;
        }

        for (int i = left; i <=right ; i++) {
            List<Integer> temp = new LinkedList<Integer>(integers);
            if (i != left && nums[i] == nums[i-1]) {
                continue ;
            }
            temp.add(nums[i]);
            this.subsetsWithDup(nums, k-1, i+1, right, temp);
        }
    }
}
