package com.lzhao.leetcode._201_240._215_kthLargeElementInAnArray;

import java.util.PriorityQueue;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int num : nums)
        {
            if (queue.size() < k)
            {
                queue.offer(num);
            } else
            {
                if (num > queue.peek())
                {
                    queue.poll();
                    queue.offer(num);
                }
            }
        }

        return queue.poll();
    }
}
