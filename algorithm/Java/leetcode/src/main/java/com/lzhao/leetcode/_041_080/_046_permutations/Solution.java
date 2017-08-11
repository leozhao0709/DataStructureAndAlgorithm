package com.lzhao.leetcode._041_080._046_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    List<List<Integer>> permute(int[] nums) {

        this.permute(nums, 0, nums.length-1);

        return this.result;
    }

    private void permute(int[] nums, int i, int j) {

        if (i >= j) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int num : nums) {
                temp.add(num);
            }
            this.result.add(temp);
            return;
        }

        for (int k = i; k <= j; k++) {
            this.swap(nums, i, k);
            this.permute(nums, i+1, j);
            this.swap(nums, k, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
