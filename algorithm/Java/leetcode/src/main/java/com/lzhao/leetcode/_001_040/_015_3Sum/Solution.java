package com.lzhao.leetcode._001_040._015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 8/4/17.
 */

class Solution {

    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            Integer current = nums[i];
            List<List<Integer>> threeSumArray = this.threeSum(nums, i, nums.length - 1);
            result.addAll(threeSumArray);
        }
        
        return result;
    }

    private List<List<Integer>> threeSum(int[] sortedNums, int begin, int end) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        int target = -sortedNums[begin];

        int i = begin + 1;
        int j = end;

        while (i < j) {
            if (sortedNums[i] == target - sortedNums[j]) {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(sortedNums[begin]);
                temp.add(sortedNums[i]);
                temp.add(sortedNums[j]);
                result.add(temp);
                i++;
                j--;
                while (i < sortedNums.length && sortedNums[i] == sortedNums[i - 1]) {
                    i++;
                }
                while (j >= 0 && sortedNums[j] == sortedNums[j+1]) {
                    j--;
                }
            } else if (sortedNums[i] < target - sortedNums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
