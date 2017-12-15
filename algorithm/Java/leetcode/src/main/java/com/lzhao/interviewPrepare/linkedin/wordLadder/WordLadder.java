package com.lzhao.interviewPrepare.linkedin.wordLadder;

import java.util.*;

/**
 * Created by lzhao on 11/23/17.
 */

class WordLadder {

    List<String> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<String>(wordList);
        Map<String, String> map = new HashMap<String, String>();
        wordSet.remove(beginWord);
        this.BFS(beginWord, endWord, wordSet, map);

        return this.findOnePath(beginWord, endWord, map);
    }

    private List<String> findOnePath(String beginWord, String endWord, Map<String, String> map) {
        List<String> res = new LinkedList<String>();

        if (!map.containsKey(endWord)) {
            return res;
        } else {
            res.add(endWord);
            String parent = map.get(endWord);
            while (parent != null) {
                res.add(parent);
                parent = map.get(parent);
            }
            Collections.reverse(res);
        }

        return res;
    }

    private void BFS(String beginWord, String endWord, Set<String> wordSet, Map<String, String> map) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer(beginWord);
        map.put(beginWord, null);
        while (!queue.isEmpty()) {
            String curr = queue.poll();

            char[] currArray = curr.toCharArray();

            for (int i = 0; i < currArray.length; i++)
            {
                char temp = currArray[i];
                for(char j = 'a'; j <= 'z'; j++) {
                    if (j != temp) {
                        currArray[i] = j;
                        String next = new String(currArray);
                        if (wordSet.contains(next)) {
                            queue.offer(next);
                            map.put(next, curr);
                            wordSet.remove(next);

                            if (next.equals(endWord)) {
                                return;
                            }
                        }
                    }
                }
                currArray[i] = temp;
            }
        }
    }

}
