package com.lzhao.leetcode._121_160._127_wordLadder;

import java.util.*;

/**
 * Created by lzhao on 8/24/17.
 */

class Solution {

    int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int step = 2;

        Set<String> wordSet = new HashSet<String>(wordList);

        Queue<String> queue = new LinkedList<String>();

        queue.offer(beginWord);

        while (!queue.isEmpty()) {
            int size = queue.size(); // current level size

            for (int k = 0; k < size; k++)
            {
                String word = queue.poll();

                for (int i = 0; i < word.length(); i++)
                {
                    for (char j = 'a'; j <= 'z'; j++)
                    {
                        StringBuilder temp = new StringBuilder(word);
                        temp.setCharAt(i, j);

                        if (wordSet.contains(temp.toString())) {
                            if (temp.toString().equals(endWord)) {
                                return step;
                            }
                            queue.offer(temp.toString());
                            wordSet.remove(temp.toString());
                        }
                    }
                }
            }

            step++;
        }

        return 0;
    }
}
