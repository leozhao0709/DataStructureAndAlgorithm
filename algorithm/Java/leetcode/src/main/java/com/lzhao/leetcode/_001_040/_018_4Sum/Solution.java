package com.lzhao.leetcode._001_040._018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 8/5/17.
 */

class Solution {

    List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int current = nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            
            List<List<Integer>> threeSumList = this.threeSum(
                    nums,
                    low,
                    high,
                    target - current
            );


            for (List<Integer> aThreeSumList : threeSumList) {
                List<Integer> tempList = new ArrayList<Integer>();
                tempList.add(current);
                tempList.addAll(aThreeSumList);
                resultList.add(tempList);
            }

        }
        return resultList;
    }
    
    private List<List<Integer>> threeSum(int[] sortedNums, int low, int high, int target) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        for (int i = low; i <= high - 2; i++) {
            int current = sortedNums[i];

            if (i != low && sortedNums[i] == sortedNums[i-1]) {
                continue;
            }

            int lowTwoSum = i+1;
            int highTwoSum = high;
            List<List<Integer>> twoSum = this.twoSum(sortedNums, lowTwoSum, highTwoSum, target - current);

            for(List<Integer> twoSumList: twoSum) {
                List<Integer> tempList = new ArrayList<Integer>();
                tempList.add(current);
                tempList.addAll(twoSumList);
                resultList.add(tempList);
            }
        }
        return resultList;
    }


    private List<List<Integer>> twoSum(int[] sortedNums, int low, int high, int target) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        while (low < high) {
            if (sortedNums[low] + sortedNums[high] == target) {
                List<Integer> tempList = new ArrayList<Integer>();
                tempList.add(sortedNums[low]);
                tempList.add(sortedNums[high]);
                resultList.add(tempList);
                low++;
                high--;
                while (low < high && sortedNums[low - 1] == sortedNums[low]) {
                    low++;
                }

                while (low < high && sortedNums[high+1] == sortedNums[high]) {
                    high--;
                }
            } else if (sortedNums[low] + sortedNums[high] < target) {
                low++;
            } else {
                high--;
            }
        }

        return resultList;
    }
}
