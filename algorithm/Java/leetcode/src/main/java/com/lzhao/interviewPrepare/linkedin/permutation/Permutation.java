package com.lzhao.interviewPrepare.linkedin.permutation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 11/25/17.
 */

class Permutation {

    List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        this.helper(nums, 0, nums.length-1, res);
        return res;
    }

    private void helper(int[] nums, int start, int end, List<List<Integer>> res) {
        if (start > end) {
            List<Integer> cur = new ArrayList<Integer>();
            for(int num: nums) {
                cur.add(num);
            }
            res.add(cur);
            return;
        }

        for (int i = start; i <= end; i++)
        {
            if (!this.valid(nums, i, end)) {
                continue;
            }

            this.swap(nums, i, start);
            this.helper(nums, start+1, end, res);
            this.swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    private boolean valid(int[] nums, int start, int end) {
        for (int i = start; i <= end; i++)
        {
            if (i != start && nums[i] == nums[start]) {
                return false;
            }
        }
        return true;
    }
}
