package com.lzhao.leetcodeAmazon._015_3sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 10/1/17.
 */

class Solution {

    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int curr = nums[i];

            List<List<Integer>> twoSumList = this.twoSum(nums, i+1, nums.length-1, 0-curr);
            for(List<Integer> temp: twoSumList) {
                List<Integer> threeSumList = new LinkedList<Integer>();
                threeSumList.add(curr);
                threeSumList.addAll(temp);
                res.add(threeSumList);
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, int start, int end, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        while (start < end) {
            if (nums[start] + nums[end] == target) {
                List<Integer> temp = new LinkedList<Integer>();
                temp.add(nums[start]);
                temp.add(nums[end]);
                res.add(temp);

                start++;
                end--;
                while (start < end && nums[start] == nums[start-1]) {
                    start++;
                }

                while (start < end && nums[end] == nums[end+1]) {
                    end--;
                }
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }

        }

        return res;
    }

}
