package com.lzhao.leetcodeLinkedin._047_permutations2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {

    private List<List<Integer>> res = new LinkedList<List<Integer>>();

    List<List<Integer>> permuteUnique(int[] nums) {
        this.permuteUnique(nums, 0, nums.length-1, new LinkedList<Integer>());

        return this.res;
    }

    private void permuteUnique(int[] nums, int start, int end, List<Integer> list) {
        if (start > end) {
            this.res.add(list);
            return;
        }

        for (int i = start; i <= end; i++) {
            if (!this.isValid(nums, i)) {
                continue;
            }

            this.swap(nums, start, i);
            List<Integer> temp = new LinkedList<Integer>(list);
            temp.add(nums[start]);
            this.permuteUnique(nums, start+1, end, temp);
            this.swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private boolean isValid(int[] nums, int i) {
        for (int j = i+1; j < nums.length; j++) {
            if (nums[j] == nums[i]) {
                return false;
            }
        }

        return true;
    }
}
