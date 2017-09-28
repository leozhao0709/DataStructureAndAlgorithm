package com.lzhao.leetcodeLinkedin._244_shortestWordDistance2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lzhao on 9/27/17.
 */

class WordDistance {

    private Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

    public WordDistance(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], new ArrayList<Integer>());
            }
            map.get(words[i]).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        int i1 = 0;
        int i2 = 0;
        int distance = Integer.MAX_VALUE;
        while (i1 < list1.size() && i2 < list2.size()) {
            distance = Math.min(distance, Math.abs(list1.get(i1) - list2.get(i2)));
            if (list1.get(i1) < list2.get(i2)) {
                i1++;
            } else {
                i2++;
            }
        }

        return distance;
    }
}
