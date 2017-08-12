package com.lzhao.leetcode._041_080._047_permutations2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.permuteUnique(nums, 0, nums.length - 1);

        return this.result;
    }

    private void permuteUnique(int[] nums, int i, int j) {
        if (i >= j) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int a: nums) {
                temp.add(a);
            }

            this.result.add(temp);
            return;
        }

        loop: for (int k = i; k <=j ; k++)
        {
            int curr = nums[k];

            for (int l = k+1; l <= j; l++) {
                if (curr == nums[l]) {
                    continue loop;
                }
            }

            this.swap(nums, i, k);
            this.permuteUnique(nums, i+1, j);
            this.swap(nums, i, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
