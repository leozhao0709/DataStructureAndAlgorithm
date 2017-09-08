package com.lzhao.leetcode._161_200._187_repeatedDNASequence;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by lzhao on 9/7/17.
 */

class Solution {

    List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (s.length() <= 10) {
            return res;
        }

        int m = s.length();

        for (int i = 0; i <= m - 10; i++)
        {
            String cur = s.substring(i, i+10);
            if (!map.containsKey(cur)) {
                map.put(cur, 1);
            } else {
                if (map.get(cur) == 1) {
                    res.add(cur);
                    map.put(cur, 2);
                } else {
                    map.put(cur, map.get(cur)+1);
                }
            }
        }

        return res;
    }
}
