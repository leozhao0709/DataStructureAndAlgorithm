package com.lzhao.interviewPrepare.linkedin.topKwords;

import java.util.*;

/**
 * Created by lzhao on 11/22/17.
 */

class TopKFrequencyWords {
    List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word: words) {
            if(!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word)+1);
            }
        }

        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() != o2.getValue()? o1.getValue()-o2.getValue():-o1.getKey().compareTo(o2.getKey());
            }
        });

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(queue.size() < k) {
                queue.offer(entry);
            } else {
                if(entry.getValue() > queue.peek().getValue()) {
                    queue.poll();
                    queue.offer(entry);
                } else if(entry.getValue().equals(queue.peek().getValue())) {
                    if(entry.getKey().compareTo(queue.peek().getKey()) < 0) {
                        queue.poll();
                        queue.offer(entry);
                    }
                }
            }
        }

        List<String> res = new ArrayList<String>();

        while(!queue.isEmpty()) {
            res.add(queue.poll().getKey());
        }

        Collections.reverse(res);

        return res;
    }
}
