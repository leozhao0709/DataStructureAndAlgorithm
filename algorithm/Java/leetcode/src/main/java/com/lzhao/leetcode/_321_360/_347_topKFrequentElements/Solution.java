package com.lzhao.leetcode._321_360._347_topKFrequentElements;

import java.util.*;

/**
 * Created by lzhao on 9/21/17.
 */

class Solution {

//    List<Integer> topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < nums.length; i++)
//        {
//            if (map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i])+1);
//            } else {
//                map.put(nums[i], 1);
//            }
//        }
//
//        List[] arr = new List[nums.length+1];
//
//        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//
//            if (arr[value] == null) {
//                arr[value] = new ArrayList();
//            }
//
//            arr[value].add(key);
//        }
//
//        List<Integer> res = new LinkedList<Integer>();
//
//        for (int i = nums.length; i > 0 && k > 0; i--)
//        {
//            if (arr[i] != null) {
//                res.addAll(arr[i]);
//                k -= arr[i].size();
//            }
//        }
//
//        return res;
//    }

    List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Integer> res = new LinkedList<Integer>();

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int value = entry.getValue();
            if (queue.size() < k) {
                queue.offer(entry);
            } else {
                Map.Entry<Integer, Integer> topEntry = queue.peek();
                if (topEntry.getValue() < value) {
                    queue.poll();
                    queue.offer(entry);
                }
            }
        }

        while (!queue.isEmpty()) {
            res.add(queue.poll().getKey());
        }

        Collections.reverse(res);
        return res;
    }
}
