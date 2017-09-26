package com.lzhao.leetcodeLinkedin._127_wordLadder;

import java.util.*;

/**
 * Created by lzhao on 9/25/17.
 */

class Solution {

    int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<String>(wordList);

        Queue<String> queue = new LinkedList<String>();

        queue.offer(beginWord);

        int step = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++)
            {
                String curr = queue.poll();
                for (int j = 0; j < curr.length(); j++)
                {
                    StringBuilder sb = new StringBuilder(curr);
                    for (char k = 'a'; k <= 'z'; k++)
                    {
                        sb.setCharAt(j, k);
                        if (set.contains(sb.toString())) {
                            if (sb.toString().equals(endWord)) {
                                return step+1;
                            } else {
                                queue.offer(sb.toString());
                                set.remove(sb.toString());
                            }
                        }
                    }
                }
            }

            step++;
        }

        return 0;
    }
}
