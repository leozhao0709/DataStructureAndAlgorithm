package com.lzhao.interviewPrepare.linkedin.partitionKequalSumSubsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 11/29/17.
 */

class PartitionKsubset {

    boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }

        if (sum%k != 0) {
            return false;
        }

        boolean[] visited = new boolean[nums.length];

        return this.canPartitionKSubsets(nums, 0, k, 0, sum/k, visited);
    }

    private boolean canPartitionKSubsets(int[] nums, int start, int k,  int curSum,int target, boolean[] visited) {
        if (k == 1) {
            return true;
        }

        if (curSum > target) {
            return false;
        }

        if (curSum == target) {
            return this.canPartitionKSubsets(nums, 0, k-1, 0, target, visited);
        }

        for (int i = start; i < nums.length; i++)
        {
            if (!visited[i]) {
                visited[i] = true;
                if (this.canPartitionKSubsets(nums, i+1, k, curSum+nums[i], target, visited)) {
                    visited[i] = false;
                    return true;
                }

                visited[i] = false;
            }
        }

        return false;
    }

    List<List<Integer>> partitionKSubsets(int[] nums, int k) {
        if (this.canPartitionKSubsets(nums, k)) {
            int sum = 0;
            for (int num: nums) {
                sum += num;
            }

            List<List<Integer>> res = new ArrayList<List<Integer>>();
            boolean[] visited = new boolean[nums.length];
            this.partitionKSubsets(nums, k, 0, 0, sum/k, new ArrayList<Integer>(), res, visited);

            return res;
        }

        return null;
    }

    private void partitionKSubsets(int[] nums, int k, int start, int curSum, int target, ArrayList<Integer> curr, List<List<Integer>> res, boolean[] visited) {
        if (k == 0) {
            return;
        }

        if (curSum > target) {
            return;
        }

        if (curSum == target) {
            res.add(new ArrayList<Integer>(curr));
            this.partitionKSubsets(nums, k-1, 0, 0, target, new ArrayList<Integer>(), res, visited);
            return;
        }

        for (int i = start; i < nums.length; i++)
        {
            if (!visited[i]) {
                visited[i] = true;
                curr.add(nums[i]);
                this.partitionKSubsets(nums, k, i+1, curSum+nums[i], target, curr, res, visited);
                boolean visitedAll = true;
                for (boolean aVisited : visited)
                {
                    visitedAll &= aVisited;
                }

                if (visitedAll) {
                    return;
                }
                curr.remove(curr.size()-1);
                visited[i] = false;
            }
        }
    }
}
