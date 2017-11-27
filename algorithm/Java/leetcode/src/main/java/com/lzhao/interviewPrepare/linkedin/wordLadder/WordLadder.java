package com.lzhao.interviewPrepare.linkedin.wordLadder;

import java.util.*;

/**
 * Created by lzhao on 11/23/17.
 */

class WordLadder {

    class Ladder {
        String word;
        String parentWord;
        int distance;

        Ladder(String word, String parentWord, int distance) {
            this.word = word;
            this.distance = distance;
            this.parentWord = parentWord;
        }
    }

    List<String> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<String>(wordList);
        Map<String, Ladder> map = new HashMap<String, Ladder>();
        this.BFS(beginWord, endWord, wordSet, map);

        return this.findOnePath(beginWord, endWord, map);
    }

    private List<String> findOnePath(String beginWord, String endWord, Map<String, Ladder> map) {
        List<String> res = new LinkedList<String>();

        if (!map.containsKey(endWord))
        {
            return res;
        } else
        {
            res.add(endWord);
            String parent = map.get(endWord).parentWord;
            while (!parent.equals(beginWord))
            {
                res.add(parent);
                parent = map.get(parent).parentWord;
            }
            res.add(beginWord);
            Collections.reverse(res);
        }

        return res;
    }

    private void BFS(String beginWord, String endWord, Set<String> wordSet, Map<String, Ladder> map) {
        Queue<Ladder> queue = new LinkedList<Ladder>();

        queue.offer(new Ladder(beginWord, null, 1));

        while (!queue.isEmpty())
        {
            Ladder currLadder = queue.poll();
            String curr = currLadder.word;
            if (curr.equals(endWord))
            {
                return;
            }

            for (int i = 0; i < curr.length(); i++)
            {
                char[] currArray = curr.toCharArray();
                char temp = currArray[i];
                for (char j = 'a'; j <= 'z'; j++)
                {
                    if (temp != j)
                    {
                        currArray[i] = j;
                        String next = new String(currArray);
                        if (wordSet.contains(next))
                        {
                            Ladder nextLadder = new Ladder(next, curr, currLadder.distance + 1);
                            queue.offer(nextLadder);
                            map.put(next, nextLadder);
                            wordSet.remove(next);
                        }
                    }
                }
            }

        }
    }
}
