package com.lzhao.leetcode._041_080._046_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    private List<String> result1 = new ArrayList<String>();

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

    List<String> permute(String s) {
        char[] c = s.toCharArray();
        this.permute(c, 0, c.length-1);

        return this.result1;
    }

    private void permute(char[] c, int i, int j) {

        if (i >= j) {
            this.result1.add(new String(c));
            return;
        }

        for (int k = i; k <=j; k++)
        {
            this.swap(c, i, k);
            this.permute(c, i+1, j);
            this.swap(c, k, i);
        }
    }

    private void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
