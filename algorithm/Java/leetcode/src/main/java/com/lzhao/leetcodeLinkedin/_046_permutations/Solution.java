package com.lzhao.leetcodeLinkedin._046_permutations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {

    private List<List<Integer>> res = new LinkedList<List<Integer>>();

    List<List<Integer>> permute(int[] nums) {
        this.permute(nums, 0, nums.length-1, new ArrayList<Integer>());

        return this.res;
    }

    private void permute(int[] nums, int start, int end, List<Integer> integers) {
        if (start > end) {
            this.res.add(integers);
            return;
        }

        for (int i = start; i <= end; i++) {
            this.swap(nums, i, start);
            List<Integer> list = new LinkedList<Integer>(integers);
            list.add(nums[start]);
            this.permute(nums, start+1, end, list);
            this.swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
