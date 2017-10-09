package com.lzhao.leetcodeAmazon._127_wordLadder;

import java.util.*;

/**
 * Created by lzhao on 10/8/17.
 */

class Solution {

    int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<String>(wordList);
        int step = 1;
        
        Queue<String> queue = new LinkedList<String>();
        queue.offer(beginWord);
        
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                StringBuilder curr = new StringBuilder(queue.poll());
                for (int j = 0; j < curr.length(); j++) {
                    StringBuilder temp = new StringBuilder(curr);
                    for(char k='a'; k <= 'z'; k++) {
                        temp.setCharAt(j, k);
                        if (set.contains(temp.toString())) {
                            if (temp.toString().equals(endWord)) {
                                return step+1;
                            }
                            queue.offer(temp.toString());
                            set.remove(temp.toString());
                        }
                    }
                }
            }
            step++;
        }

        return 0;
    }
}
