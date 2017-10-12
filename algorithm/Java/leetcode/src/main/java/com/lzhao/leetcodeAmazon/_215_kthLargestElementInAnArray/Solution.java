package com.lzhao.leetcodeAmazon._215_kthLargestElementInAnArray;

import java.util.PriorityQueue;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(nums[i]);
            } else if (nums[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.offer(nums[i]);
            }
        }

        return priorityQueue.peek();
    }
}
